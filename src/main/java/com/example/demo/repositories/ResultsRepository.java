package com.example.demo.repositories;

import com.example.demo.model.Results;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultsRepository extends CrudRepository <Results, Long> {
    Results findById(long id);
}
