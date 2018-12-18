package com.example.demo.repositories;

import com.example.demo.model.Auction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuctionRepository extends CrudRepository<Auction, Long> {

    List<Auction> findByPrice(Long price);
}
