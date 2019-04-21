package com.journaldev.spring.service;

import com.journaldev.spring.pojo.User;

/**接口定义*/

public interface IUser {

  

    public void addUser(User u);

      

    public User getUserById(int id);

      

}