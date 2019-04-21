package com.journaldev.spring.service.provider;

import java.util.ArrayList;
import java.util.List;

import com.journaldev.spring.pojo.User;
import com.journaldev.spring.service.IUser;

/**实现类*/

public class UserImpl implements IUser {

      

    private static List<User> USER_LIST = new ArrayList<User>();

      

    static{

        for(int i=0;i<10;i++){

            User u = new User();

            u.setAddress("address"+i);

            u.setId(i);

            u.setName("name"+i);

              

            USER_LIST.add(u);

        }

    }

      

    public void addUser(User u) {
    	throw new RuntimeException("add user fail!");
        /*USER_LIST.add(u);

        System.out.println("total:"+USER_LIST.size());*/

    }

  

    public User getUserById(int id) {

        for(int i=0;i<USER_LIST.size();i++){

            if(USER_LIST.get(i).getId() == id){

                return USER_LIST.get(i);
                

            }

        }

        return null;

    }

}