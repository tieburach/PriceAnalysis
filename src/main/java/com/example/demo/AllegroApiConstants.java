package com.example.demo;

import com.example.demo.allegro.ServiceService;

class AllegroApiConstants {

    private static final String WEBAPIKEY = "22092f5b";
    private static final ServiceService ALLEGROWEBAPISERVICE = new ServiceService();
    private static final int COUNTRYCODE = 1;

    static String getWEBAPIKEY() {
        return WEBAPIKEY;
    }

    static ServiceService getAllegroWebApiService() {
        return ALLEGROWEBAPISERVICE;
    }

    static int getCOUNTRYCODE() {
        return COUNTRYCODE;
    }
}
