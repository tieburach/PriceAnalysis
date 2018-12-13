package com.example.demo;


import com.example.demo.allegro.*;
import com.example.demo.model.Category;
import com.example.demo.repositories.CategoryRepository;

import java.util.List;

public class ApiHandler {

    private static ServicePort allegro = AllegroApiConstants.getAllegroWebApiService().getServicePort();


    private static DoGetItemsListRequest createRequest() {
        //create new request
        DoGetItemsListRequest itemsreq = new DoGetItemsListRequest();
        //set constants and request size
        itemsreq.setCountryId(AllegroApiConstants.getCOUNTRYCODE());
        itemsreq.setWebapiKey(AllegroApiConstants.getWEBAPIKEY());
        itemsreq.setResultSize(100);
        return itemsreq;
    }

    public static List<ItemsListType> findByCategory(int categoryId) {
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


    public static List<ItemsListType> findByName(String keyword) {
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

    public static List<CatInfoType> loadAllCategories(CategoryRepository categoryRepository) {
        DoGetCatsDataRequest doGetCatsDataRequest = new DoGetCatsDataRequest();
        doGetCatsDataRequest.setCountryId(AllegroApiConstants.getCOUNTRYCODE());
        doGetCatsDataRequest.setWebapiKey(AllegroApiConstants.getWEBAPIKEY());
        DoGetCatsDataResponse doGetCatsDataResponse = allegro.doGetCatsData(doGetCatsDataRequest);
        for (CatInfoType item : doGetCatsDataResponse.getCatsList().getItem()) {
            categoryRepository.save(new Category((long) item.getCatId(), item.getCatName(), (long) item.getCatParent()));
        }
        return doGetCatsDataResponse.getCatsList().getItem();
    }
}

