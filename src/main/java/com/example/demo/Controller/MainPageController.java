package com.example.demo.Controller;

import com.example.demo.allegroAPI.ApiHandler;
import com.example.demo.model.*;
import com.example.demo.useful.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/single")
    public String single(){
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

    @PostMapping(value="/selection")
    public String showRaport (@ModelAttribute("categoryname") ParameterIndex bean) {
        apiHandler.findAndSave(SearchDetails.getCategoryNumber(),bean.getParameterindex());
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        Logger.log("Current relative path is: " + s);
        try {
            Runtime.getRuntime().exec("Rscript Script.R " + SearchDetails.getCategoryName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "raports";
    }
}
