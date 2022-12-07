package com.endsemester.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.endsemester.main.Entity.UserType;
import com.endsemester.main.Repo.Repo;

@Controller
public class MainController {
    @Autowired
    Repo repo;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String name, @RequestParam int age) {
        UserType newUser = new UserType();

        newUser.setFname(name);
        newUser.setAge(age);

        repo.save(newUser);

        return "index";
    }
}
