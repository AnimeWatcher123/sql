package com.endsemester.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.endsemester.main.Entity.UserType;
import com.endsemester.main.Repo.Repo;

@RestController
public class RegisteredUsers {
    @Autowired
    Repo repo;

    @GetMapping("/getUsers")
    public List<UserType> getUsers() {
        return repo.findAll();
    }
}
