package com.nam.spring_44.dao;

import com.nam.spring_44.bean.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public static int save(User u){
        return 42;
    }

    public static List<User> getAllRecords(){
        List<User> list = new ArrayList<>();

        User u = new User();

        u.setId(42);
        u.setName("Alex");
        u.setPassword("qwerty");
        u.setEmail("1@2");
        u.setSex("F");
        u.setCountry("Ussr");

        list.add(u);

        return list;
    }
}
