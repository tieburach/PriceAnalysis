package com.example.demo;

import com.example.demo.allegro.ItemsListType;
import com.example.demo.allegro.ParameterInfoType;
import com.example.demo.model.Auction;
import com.example.demo.repositories.AuctionRepository;
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
    @Autowired
    AuctionRepository auctionRepository;

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            List<ItemsListType> list = ApiHandler.findByCategory(18050);

            for (ItemsListType item : list) {
                String title = item.getItemTitle();
                List<ParameterInfoType> parameterinfotype = item.getParametersInfo().getItem();
                ParameterInfoType firstparameter = parameterinfotype.get(2);
                ParameterInfoType secondparameter = parameterinfotype.get(3);


                    auctionRepository.save(new Auction(item.getItemId(),
                            item.getPriceInfo().getItem().get(0).getPriceValue(),
                            firstparameter.getParameterName(),
                            Float.parseFloat(firstparameter.getParameterValue().getItem().get(0)),
                            firstparameter.getParameterUnit(),
                            secondparameter.getParameterName(),
                            Float.parseFloat(secondparameter.getParameterValue().getItem().get(0)),
                            secondparameter.getParameterUnit(),
                            item.getItemTitle())
                    );


            }

        };
    }
}
