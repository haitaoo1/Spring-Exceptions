package com.haitao.springboot.error.springbooterror.models.domain;

public class User {

    private String name;
    private String lastname;
    private Long id;

    private Rol rol;

    public User() {
    }

    public User(Long id,String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol.getName();
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

}
