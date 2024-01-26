package com.haitao.springboot.error.springbooterror.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haitao.springboot.error.springbooterror.exceptions.UserNotFoundException;
import com.haitao.springboot.error.springbooterror.models.domain.User;

@Service
public class UserSeviceImpl implements UserServices {

    private List<User> users;

    public UserSeviceImpl(){
        this.users = new ArrayList<>();
        users.add(new User(1L,"Pepe", "Gonzalez"));
        users.add(new User(2L,"Juan", "Mena"));
        users.add(new User(3L,"Cristian", "Lopez"));
        users.add(new User(4L,"Alvaro", "Ramirez"));
        users.add(new User(5L,"Iker", "Cadena"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(Long id) {
        User user = null;
        for(User us : users){
            if(us.getId().equals(id)){
                user = us;
                break;
            }
        }
        //capturamos la excepction
        
        if(user == null){
            throw new UserNotFoundException("El usuario no existe");
        }
        return user;
    }

    
}
