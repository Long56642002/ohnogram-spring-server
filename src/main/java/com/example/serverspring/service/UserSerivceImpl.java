package com.example.serverspring.service;

import com.example.serverspring.model.User;
import com.example.serverspring.repository.UserRepository;
import com.example.serverspring.service.iService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserSerivceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Collection<User> getUsers() {
        return this.userRepository.findAll();
    }
}
