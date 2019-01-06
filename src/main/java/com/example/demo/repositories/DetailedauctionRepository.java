package com.example.demo.repositories;

import com.example.demo.model.entitites.Detailedauction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DetailedauctionRepository extends CrudRepository<Detailedauction, Long> {

    List<Detailedauction> findByPrice(Float price);
}
