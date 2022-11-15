package com.generation.firstproyect.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.generation.firstproyect.model.User;

@Service
public class UserServiceArrayList implements UserService{
    
    private List <User> userList = new ArrayList<>();

    public UserServiceArrayList(){

    }

    @Override
    public List<User> getAll(){
        return userList;
    }

    @Override
    public void add(User user){
        userList.add(user);
    }

    @Override
    public void remove(User user){
        userList.remove(user);
    }

    @Override
    public int size(){
        return userList.size();
    }

    @Override
    public User getUser(int position){
        return userList.get(position);
    }


}
