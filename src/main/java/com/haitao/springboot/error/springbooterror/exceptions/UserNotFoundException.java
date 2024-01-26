package com.haitao.springboot.error.springbooterror.exceptions;

public class UserNotFoundException extends RuntimeException {
    //con la extension de Exception tenemos que manejarlo con try catch
    public UserNotFoundException(String message){
        super(message);
    }

}
