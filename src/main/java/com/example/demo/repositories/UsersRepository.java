package com.example.demo.repositories;

import com.example.demo.model.entitites.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Long> {

    Users findById(long id);
    Users findByUsernameAndPassword (String username, String password);
}
