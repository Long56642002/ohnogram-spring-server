package com.example.serverspring.controller;

import com.example.serverspring.service.iService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public ResponseEntity <Map<String, Object>> getAllUsers(){
        String message = "successfully";
        Object data = new Object();
        try {
            data = this.userService.getUsers();
        } catch (Exception e) {
            message = e.getMessage();
        } finally {
            Map<String, Object> response = Map.of(
                    "data",Map.ofEntries(
                            Map.entry("message",message),
                            Map.entry("data",data)
                    )
            );
            return ResponseEntity.ok().body(response);
        }
    }
}
