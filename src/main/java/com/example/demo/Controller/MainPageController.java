package com.example.demo.Controller;

import com.example.demo.allegroAPI.ApiHandler;
import com.example.demo.model.*;
import com.example.demo.useful.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

@Controller
public class MainPageController {

    @Autowired
    public MainPageController(ApiHandler apiHandler) {
        this.apiHandler = apiHandler;
    }

    private final
    ApiHandler apiHandler;

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/single")
    public String single() {
        return "single";
    }

    @PostMapping("/single")
    public String showPage(@ModelAttribute("categoryText") CategoryText bean) {
        SearchDetails.setCategoryNumber(bean.getCategoryNumber());
        AvaiableParameters.setParameterList(apiHandler.findParametersByCategory(bean.getCategoryNumber()));
        Logger.log("Dostepne parametry:");
        for (Parameter string : AvaiableParameters.getParameterList()) {
            Logger.log(string.getName());
        }
        return "redirect:selection";
    }

    @GetMapping("/selection")
    public String selectFirstParameter(Map<String, Object> model) {
        List<Parameter> avaiableparameters = AvaiableParameters.getParameterList();
        model.put("parameters", avaiableparameters);
        return "selection";
    }

    @PostMapping("/selection")
    public String showRaport(@ModelAttribute("categoryname") ParameterIndex bean) {
        long time1 = System.currentTimeMillis();
        Logger.log("Rozpoczynam wyszukiwanie danych");
        apiHandler.findAndSave(SearchDetails.getCategoryNumber(), bean.getParameterindex());
        Logger.log("Czas trwania wyszukiwania i zapisu danych (w milisekundach): " + (System.currentTimeMillis() - time1));
        try {
            Process p = Runtime.getRuntime().exec("Rscript Script.R " + SearchDetails.getCategoryName());
            String line;
            while (p.isAlive()) {
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(p.getInputStream()));
                while ((line = in.readLine()) != null) {
                    Logger.log(line);
                }
                in.close();
            }
        } catch (IOException e) {
            Logger.log("Error running system command" + e.getMessage());
        }

        return "redirect:raports";
    }

    @GetMapping("/raports")
    public void raports(Map<String, Object> model) {
        List<String> sites = apiHandler.getAuctionUrls();
        model.put("sites", sites);
    }
}
