package com.example.demo.allegroAPI;

import com.example.demo.allegro.ServiceService;


class AllegroApiConstants {

    private final ServiceService ALLEGROWEBAPISERVICE = new ServiceService();

    String getWEBAPIKEY() {
        return "22092f5b";
    }
    ServiceService getAllegroWebApiService() {
        return ALLEGROWEBAPISERVICE;
    }
    int getCOUNTRYCODE() {
        return 1;
    }
}
