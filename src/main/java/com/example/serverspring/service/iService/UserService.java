package com.example.serverspring.service.iService;

import com.example.serverspring.model.User;

import java.util.Collection;

public interface UserService {
    public abstract Collection<User> getUsers();
}
