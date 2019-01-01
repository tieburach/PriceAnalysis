package com.example.demo.allegroAPI;


import com.example.demo.allegro.*;
import com.example.demo.model.Auction;
import com.example.demo.model.Category;
import com.example.demo.model.SearchDetails;
import com.example.demo.repositories.AuctionRepository;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.ResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ApiHandler {

    private final
    AuctionRepository auctionRepository;

    private final
    CategoryRepository categoryRepository;

    private final
    ResultsRepository resultsRepository;

    private final
    AllegroApiConstants allegroApiConstants = new AllegroApiConstants();
    private ServicePort allegro = allegroApiConstants.getAllegroWebApiService().getServicePort();

    @Autowired
    public ApiHandler(AuctionRepository auctionRepository, CategoryRepository categoryRepository, ResultsRepository resultsRepository) {
        this.auctionRepository = auctionRepository;
        this.categoryRepository = categoryRepository;
        this.resultsRepository = resultsRepository;

    }

    private DoGetItemsListRequest createRequest() {
        //create new request
        DoGetItemsListRequest itemsreq = new DoGetItemsListRequest();
        //set constants and request size
        itemsreq.setCountryId(allegroApiConstants.getCOUNTRYCODE());
        itemsreq.setWebapiKey(allegroApiConstants.getWEBAPIKEY());
        itemsreq.setResultSize(100);
        return itemsreq;
    }

    public List<ItemsListType> findByCategory(int categoryId) {
        DoGetItemsListRequest itemsreq = createRequest();
        ArrayOfFilteroptionstype filter = new ArrayOfFilteroptionstype();
        FilterOptionsType allFinder = new FilterOptionsType();
        allFinder.setFilterId("category");
        ArrayOfString finder = new ArrayOfString();
        finder.getItem().add("" +categoryId);
        allFinder.setFilterValueId(finder);
        filter.getItem().add(allFinder);
        itemsreq.setFilterOptions(filter);
        DoGetItemsListResponse doGetItemsList = allegro.doGetItemsList(itemsreq);
        return doGetItemsList.getItemsList().getItem();
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

    public List <String> getAuctionUrls(){
        List <String> adresses = new ArrayList<>();
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
        finder.getItem().add("" +categoryId);
        allFinder.setFilterValueId(finder);
        filter.getItem().add(allFinder);
        itemsreq.setFilterOptions(filter);
        DoGetItemsListResponse doGetItemsList = allegro.doGetItemsList(itemsreq);
        return doGetItemsList.getItemsList().getItem().get(0).getParametersInfo().getItem();
    }

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
}

