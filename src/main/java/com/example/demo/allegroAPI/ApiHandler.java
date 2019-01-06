package com.example.demo.allegroAPI;


import com.example.demo.allegro.*;
import com.example.demo.model.*;
import com.example.demo.model.entitites.Auction;
import com.example.demo.model.entitites.Category;
import com.example.demo.model.entitites.Detailedauction;
import com.example.demo.model.entitites.History;
import com.example.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class ApiHandler {

    private final AuctionRepository auctionRepository;
    private final CategoryRepository categoryRepository;
    private final ResultsRepository resultsRepository;
    private final HistoryRepository historyRepository;
    private final DetailedauctionRepository detailedauctionRepository;


    private final
    AllegroApiConstants allegroApiConstants = new AllegroApiConstants();
    private ServicePort allegro = allegroApiConstants.getAllegroWebApiService().getServicePort();

    @Autowired
    public ApiHandler(AuctionRepository auctionRepository, CategoryRepository categoryRepository, ResultsRepository resultsRepository, HistoryRepository historyRepository, DetailedauctionRepository detailedauctionRepository) {
        this.auctionRepository = auctionRepository;
        this.categoryRepository = categoryRepository;
        this.resultsRepository = resultsRepository;
        this.historyRepository = historyRepository;
        this.detailedauctionRepository = detailedauctionRepository;
    }

    private DoGetItemsListRequest createRequest() {
        //create new request
        DoGetItemsListRequest itemsreq = new DoGetItemsListRequest();
        //set constants and request size
        itemsreq.setCountryId(allegroApiConstants.getCOUNTRYCODE());
        itemsreq.setWebapiKey(allegroApiConstants.getWEBAPIKEY());
        itemsreq.setResultSize(1000);
        return itemsreq;
    }

    private DoShowUserRequest createRequestUserRatings(Long userId) {
        //create new request
        DoShowUserRequest userRequest = new DoShowUserRequest();
        userRequest.setCountryId(allegroApiConstants.getCOUNTRYCODE());
        userRequest.setWebapiKey(allegroApiConstants.getWEBAPIKEY());
        userRequest.setUserId(userId);
        return userRequest;
    }


    @SuppressWarnings("unused")
    private DoShowUserResponse findUserByUserId(int userId) {
        DoShowUserRequest userRequest = createRequestUserRatings((long) userId);
        return allegro.doShowUser(userRequest);
    }


    private List<ItemsListType> findByCategory(int categoryId) {
        DoGetItemsListRequest itemsreq = createRequest();
        ArrayOfFilteroptionstype filter = new ArrayOfFilteroptionstype();
        FilterOptionsType allFinder = new FilterOptionsType();
        allFinder.setFilterId("category");
        ArrayOfString finder = new ArrayOfString();
        finder.getItem().add("" + categoryId);
        allFinder.setFilterValueId(finder);
        filter.getItem().add(allFinder);
        itemsreq.setFilterOptions(filter);
        DoGetItemsListResponse doGetItemsList = allegro.doGetItemsList(itemsreq);
        return doGetItemsList.getItemsList().getItem();
    }

    private List<ItemsListType> findAllByCategory(int categoryId) {
        DoGetItemsListRequest itemsreq = createRequest();
        ArrayOfFilteroptionstype filter = new ArrayOfFilteroptionstype();
        FilterOptionsType allFinder = new FilterOptionsType();
        allFinder.setFilterId("category");
        ArrayOfString finder = new ArrayOfString();
        finder.getItem().add("" + categoryId);
        allFinder.setFilterValueId(finder);
        filter.getItem().add(allFinder);
        itemsreq.setFilterOptions(filter);
        DoGetItemsListResponse firstGet = allegro.doGetItemsList(itemsreq);
        ArrayOfItemslisttype itemsList = firstGet.getItemsList();
        for (int i = 1000; i < firstGet.getItemsCount(); i += 1000) {
            itemsreq.setResultOffset(i);
            DoGetItemsListResponse get = allegro.doGetItemsList(itemsreq);
            itemsList.getItem().addAll(get.getItemsList().getItem());
        }
        return itemsList.getItem();
    }


    public void findAndSave(int categoryId, int parameterId) {
        SearchDetails.setCategoryName(categoryRepository.findById(categoryId).getName());
        List<ItemsListType> list = findByCategory(categoryId);
        auctionRepository.deleteAll();
        for (ItemsListType item : list) {
            List<ParameterInfoType> parameterinfotype = item.getParametersInfo().getItem();
            ParameterInfoType firstparameter = parameterinfotype.get(parameterId);
            auctionRepository.save(new Auction(item.getItemId(),
                    item.getPriceInfo().getItem().get(0).getPriceValue(),
                    firstparameter.getParameterName(),
                    Float.parseFloat(firstparameter.getParameterValue().getItem().get(0)),
                    firstparameter.getParameterUnit(), item.getItemTitle()));

        }
    }


    public void findFirmRaport(int categoryId, int parameterId) {
        SearchDetails.setCategoryName(categoryRepository.findById(categoryId).getName());
        detailedauctionRepository.deleteAll();
        List<ItemsListType> list = findAllByCategory(categoryId);
        String mainparameter = list.get(0).getParametersInfo().getItem().get(parameterId).getParameterName();
        for (ItemsListType item : list) {
            try {
                List<ParameterInfoType> parameterinfotype = item.getParametersInfo().getItem();
                ParameterInfoType parameter = parameterinfotype.get(parameterId);
                Float parameterValue;
                String parameterUnit;
                try {
                    parameterValue = Float.parseFloat(parameter.getParameterValue().getItem().get(0));
                    parameterUnit = parameter.getParameterUnit();
                } catch (Exception e) {
                    String together = parameter.getParameterValue().getItem().get(0);
                    String parts[] = together.split("\\s+");
                    try {
                        parameterValue = Float.parseFloat(parts[0]);
                        parameterUnit = parts[1];
                    } catch (Exception ignored) {
                 //       Logger.log("Blad parametru (zla wartosc)");
                        parameterValue = null;
                        parameterUnit = null;
                    }
                }
                if (parameterValue != null && parameter.getParameterName().equals(mainparameter)) {
                    detailedauctionRepository.save(new Detailedauction(item.getItemId(),
                            item.getItemTitle(),
                            item.getPriceInfo().getItem().get(0).getPriceValue(),
                            (long) item.getCategoryId(),
                            categoryRepository.findById(item.getCategoryId()).getName(),
                            item.getConditionInfo(),
                            item.getPhotosInfo().getItem().size(),
                            parameter.getParameterName(),
                            parameterValue,
                            parameterUnit,
                            (long) item.getSellerInfo().getUserId(),
                            item.getSellerInfo().getUserLogin()
                    ));
                }
            } catch (Exception e) {
               // Logger.log("Uzytkownik nie zdefiniowal parametrow");
            }
        }
    }

    public List<String> getAuctionUrls() {
        List<String> adresses = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            adresses.add("https://allegro.pl/oferta/-" + auctionRepository.findByPrice(resultsRepository.findById(i).getPrice()).get(0).getId());
        }
        return adresses;
    }


    public List<ParameterInfoType> findParametersByCategory(int categoryId) {
        DoGetItemsListRequest itemsreq = new DoGetItemsListRequest();
        itemsreq.setCountryId(allegroApiConstants.getCOUNTRYCODE());
        itemsreq.setWebapiKey(allegroApiConstants.getWEBAPIKEY());
        itemsreq.setResultSize(1);
        ArrayOfFilteroptionstype filter = new ArrayOfFilteroptionstype();
        FilterOptionsType allFinder = new FilterOptionsType();
        allFinder.setFilterId("category");
        ArrayOfString finder = new ArrayOfString();
        finder.getItem().add("" + categoryId);
        allFinder.setFilterValueId(finder);
        filter.getItem().add(allFinder);
        itemsreq.setFilterOptions(filter);
        DoGetItemsListResponse doGetItemsList = allegro.doGetItemsList(itemsreq);
        return doGetItemsList.getItemsList().getItem().get(0).getParametersInfo().getItem();
    }


    public void saveToSearchHistory(int categoryid, String parameter) {
        historyRepository.save(new History(
                1L,
                Date.valueOf(LocalDate.now()),
                Time.valueOf(LocalTime.now()),
                categoryRepository.findById((long) categoryid).getName(),
                (long) categoryid,
                parameter)
        );
    }


    @SuppressWarnings("unused")
    public List<ItemsListType> findByName(String keyword) {
        DoGetItemsListRequest itemsreq = createRequest();
        ArrayOfFilteroptionstype filter = new ArrayOfFilteroptionstype();
        FilterOptionsType allFinder = new FilterOptionsType();
        allFinder.setFilterId("search");
        ArrayOfString finder = new ArrayOfString();
        finder.getItem().add(keyword);
        allFinder.setFilterValueId(finder);
        filter.getItem().add(allFinder);
        itemsreq.setFilterOptions(filter);
        DoGetItemsListResponse doGetItemsList = allegro.doGetItemsList(itemsreq);
        return doGetItemsList.getItemsList().getItem();
    }

    @SuppressWarnings("unused")
    public List<CatInfoType> loadAllCategories(CategoryRepository categoryRepository) {
        DoGetCatsDataRequest doGetCatsDataRequest = new DoGetCatsDataRequest();
        doGetCatsDataRequest.setCountryId(allegroApiConstants.getCOUNTRYCODE());
        doGetCatsDataRequest.setWebapiKey(allegroApiConstants.getWEBAPIKEY());
        DoGetCatsDataResponse doGetCatsDataResponse = allegro.doGetCatsData(doGetCatsDataRequest);
        for (CatInfoType item : doGetCatsDataResponse.getCatsList().getItem()) {
            categoryRepository.save(new Category((long) item.getCatId(), item.getCatName(), (long) item.getCatParent()));
        }
        return doGetCatsDataResponse.getCatsList().getItem();
    }

    public Iterable<History> getHistoryOfUser() {
        return historyRepository.findAll();
    }
}

