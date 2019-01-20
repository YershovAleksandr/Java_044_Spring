package com.nam.spring_44.dao;

import com.nam.spring_44.bean.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static List<User> list = new ArrayList<>();

    public static int save(User u){
        return 42;
    }

    public static List<User> getAllRecords(){


        User u = new User();

        u.setId(42);
        u.setName("Alex");
        u.setPassword("qwerty");
        u.setEmail("1@2");
        u.setSex("male");
        u.setCountry("Belarus");

        list.add(u);

        return list;
    }

    public static int update(User u){
        return 42;
    }

    public static void delete(User u){
        //return 42;
    }

    public static User getRecordById(int id){
        return list.get(0);
    }

}
