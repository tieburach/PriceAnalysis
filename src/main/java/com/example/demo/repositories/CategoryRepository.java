package com.example.demo.repositories;

import com.example.demo.model.entitites.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryRepository extends CrudRepository <Category, Long> {

    Category findById(long id);
    List<Category> findByParentid(Long parentid);
}
