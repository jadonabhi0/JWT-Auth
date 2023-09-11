package com.abhi.auth.service;/*
    @author jadon
*/

import com.abhi.auth.modals.User;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    List<User> lst = new LinkedList<>();

    UserService(){
        lst.add(new User(UUID.randomUUID().toString() , "Abhishek Jadon", "Jadonabhi0@Gmail.com"));
        lst.add(new User(UUID.randomUUID().toString() , "Aman Jadon", "Jadonaman0@Gmail.com"));
        lst.add(new User(UUID.randomUUID().toString() , "Shikha Jadon", "Jadonshikha0@Gmail.com"));
    }


    public List<User> getAllUser(){
        return lst;
    }

}
