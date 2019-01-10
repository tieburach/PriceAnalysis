package com.example.demo.Controller;

import com.example.demo.allegroAPI.ApiHandler;
import com.example.demo.model.*;
import com.example.demo.model.entitites.History;
import com.example.demo.model.entitites.Users;
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
    public MainPageController(ApiHandler apiHandler, UserActions userActions) {
        this.apiHandler = apiHandler;
        this.userActions = userActions;
    }

    private final
    ApiHandler apiHandler;
    private final
    UserActions userActions;


    @GetMapping("/")
    public String welcome() {
        return "login";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/normal/single")
    public String single() {
        return "normal/single";
    }

    @GetMapping("/normal/welcome")
    public String welcomeSingle() {
        return "normal/welcome";
    }

    @GetMapping("/firm/welcomefirm")
    public String welcomeFirm() {
        return "firm/welcomefirm";
    }








    @GetMapping("/firm/firmsingle")
    public String firmsingle() {
        return "firm/firmsingle";
    }


    @PostMapping("/normal/single")
    public String showPage(@ModelAttribute("categoryText") CategoryText bean) {
        SearchDetails.setCategoryNumber(bean.getCategoryNumber());
        AvaiableParameters.setParameterList(apiHandler.findParametersByCategory(bean.getCategoryNumber()));
        Logger.log("Dostepne parametry:");
        for (Parameter string : AvaiableParameters.getParameterList()) {
            Logger.log(string.getName());
        }
        return "redirect:selection";
    }

    @PostMapping("/firm/firmsingle")
    public String showPageFirm(@ModelAttribute("categoryText") CategoryText bean) {
        SearchDetails.setCategoryNumber(bean.getCategoryNumber());
        AvaiableParameters.setParameterList(apiHandler.findParametersByCategory(bean.getCategoryNumber()));
        Logger.log("Dostepne parametry:");
        for (Parameter string : AvaiableParameters.getParameterList()) {
            Logger.log(string.getName());
        }
        return "redirect:selectionfirm";
    }

    @GetMapping("/normal/selection")
    public String selectFirstParameter(Map<String, Object> model) {
        List<Parameter> avaiableparameters = AvaiableParameters.getParameterList();
        model.put("parameters", avaiableparameters);
        return "normal/selection";
    }

    @GetMapping("/firm/selectionfirm")
    public String selectFirstParameterFirm(Map<String, Object> model) {
        List<Parameter> avaiableparameters = AvaiableParameters.getParameterList();
        model.put("parameters", avaiableparameters);
        return "firm/selectionfirm";
    }

    @GetMapping("/logout")
    public String logout(){
        userActions.setCurrentUserId(0);
        return "logout";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("users") Users users){
        if (userActions.tryToLog(users.getUsername(), users.getPassword())){
            if(userActions.getCurrentUserRole().equals("single"))
                return "redirect:normal/welcome";
            else
                return "redirect:firm/welcomefirm";
        }

        else
            return "login";
    }


    @PostMapping("/register")
    public String register(@ModelAttribute("users") Users users){
        userActions.saveNewUser(users);
        return "login";
    }



    @PostMapping("/normal/selection")
    public String showRaport(@ModelAttribute("categoryname") ParameterIndex bean) {
        long time1 = System.currentTimeMillis();
        Logger.log("Rozpoczynam wyszukiwanie danych");
        apiHandler.saveToSearchHistory(SearchDetails.getCategoryNumber(), bean.getParameterindex() + "");
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


    @PostMapping("/firm/selectionfirm")
    public String showRaportFirm(@ModelAttribute("categoryname") ParameterIndex bean) {
        long time1 = System.currentTimeMillis();
        Logger.log("Rozpoczynam wyszukiwanie danych");
        apiHandler.saveToSearchHistory(SearchDetails.getCategoryNumber(), bean.getParameterindex() + "");
        apiHandler.findFirmRaport(SearchDetails.getCategoryNumber(), bean.getParameterindex());
        Logger.log("Czas trwania wyszukiwania i zapisu danych (w milisekundach): " + (System.currentTimeMillis() - time1));
        try {
            Process p = Runtime.getRuntime().exec("Rscript ScriptFirm.R " + SearchDetails.getCategoryName());
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

        return "redirect:raportsfirm";
    }


    @GetMapping("/normal/raports")
    public void raports(Map<String, Object> model) {
        List<String> sites = apiHandler.getAuctionUrls();
        model.put("sites", sites);
    }


    @GetMapping("/firm/raportsfirm")
    public void raportsFirm() {

    }

    @GetMapping("/history")
    public String showHistory(Map<String, Object> model){
        List<History> searches = (List<History>) apiHandler.getHistoryOfUser();
        model.put("searches", searches);
        return "history";
    }
}
