package com.ams.amsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ams.amsapi.business.UsersBusiness;
import com.ams.amsapi.model.Users;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    private UsersBusiness usersBusiness;

    @PostMapping("/login")
    public Boolean login(@RequestBody Users authenticate) {
        return usersBusiness.authenticate(authenticate);
    }
    
    @GetMapping("/{username}")
    public Users findByUsername(@PathVariable String username) {
        return usersBusiness.findByUsername(username);
    }
}
