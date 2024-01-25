package com.haitao.springboot.error.springbooterror.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.haitao.springboot.error.springbooterror.models.domain.User;
import com.haitao.springboot.error.springbooterror.services.UserServices;



@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserServices service;

    @GetMapping
    public String index(){
        //int value = 100/0;
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "ok 200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable(name = "id")Long id) {
        return service.findById(id);
    }
    
}
