package com.igorbondezam.workshopmongo.service;

import com.igorbondezam.workshopmongo.Repository.UserRepository;
import com.igorbondezam.workshopmongo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

}
