package com.example.demo.repositories;

import com.example.demo.model.entitites.Auction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuctionRepository extends CrudRepository<Auction, Long> {

    List<Auction> findByPrice(Float price);
}
