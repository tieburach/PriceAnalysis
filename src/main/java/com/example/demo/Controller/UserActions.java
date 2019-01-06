package com.example.demo.Controller;

import com.example.demo.model.entitites.Users;
import com.example.demo.repositories.UsersRepository;
import org.springframework.stereotype.Component;

@Component
public class UserActions {

    private final UsersRepository usersRepository;
    private long currentUserId;

    public UsersRepository getUsersRepository() {
        return usersRepository;
    }

    public long getCurrentUserId() {
        return currentUserId;
    }

    public void setCurrentUserId(long currentUserId) {
        this.currentUserId = currentUserId;
    }

    public UserActions(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void saveNewUser(Users users){
        usersRepository.save(users);
    }

    public String getCurrentUserRole(){
        return usersRepository.findById(currentUserId).getRole();
    }

    public boolean tryToLog(String username, String password){
        Users users = usersRepository.findByUsernameAndPassword(username, password);
        if (users == null) {
            return false;
        } else {
            setCurrentUserId(users.getId());
            return true;
        }
    }

}
