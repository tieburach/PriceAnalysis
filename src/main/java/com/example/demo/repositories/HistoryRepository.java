package com.example.demo.repositories;

import com.example.demo.model.entitites.History;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryRepository extends CrudRepository<History, Long>{
    History findById(long id);
    List<History> findByUserid(long userid);
}
