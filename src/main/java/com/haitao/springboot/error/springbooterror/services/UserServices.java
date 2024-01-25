package com.haitao.springboot.error.springbooterror.services;

import java.util.List;

import com.haitao.springboot.error.springbooterror.models.domain.User;

public interface UserServices {

    List<User> findAll();
    User findById(Long id);

}
