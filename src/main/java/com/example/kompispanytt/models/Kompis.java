package com.example.kompispanytt.models;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Johan Rune
 * Date: 2021-04-15
 * Time: 10:16
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

@Entity
public class Kompis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    protected String name;
    protected String email;
    protected String mobile;

    public Kompis (){}


    public Kompis(String name, String email, String mobile) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }



        public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    @Override
    public String toString() {
        return "Kompis{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobile + '\'' +
                '}';
    }
}
