package com.example.demo;

import com.example.demo.allegro.ItemsListType;
import com.example.demo.allegro.ParameterInfoType;
import com.example.demo.repositories.CategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    CategoryRepository categoryRepository;

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            List<ItemsListType> list = ApiHandler.findByCategory(18050);
            ItemsListType item = list.get(0);
            log.info(item.getItemTitle());
            List<ParameterInfoType> parameterinfotype = item.getParametersInfo().getItem();

            for (ParameterInfoType parameter : parameterinfotype) {
                log.info(parameter.getParameterName());
                log.info(parameter.getParameterUnit());
                log.info(parameter.getParameterValue().getItem().get(1) + "");
                int i =0;
            }
        };
    }
}
