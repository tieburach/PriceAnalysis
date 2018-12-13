package com.example.demo;

import com.example.demo.allegro.CatInfoType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class Controller {

    @GetMapping(value = "/")
    public String greeting() {
        return "czesc kocia";
    }
}
