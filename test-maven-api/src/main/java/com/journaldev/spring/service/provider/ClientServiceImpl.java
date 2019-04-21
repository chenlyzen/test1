package com.journaldev.spring.service.provider;

import com.journaldev.spring.service.ClientService;

/**
 * Created by Juntao on 2016/9/29.
 */
public class ClientServiceImpl implements ClientService {

    public String sayHello(String name) {

        return "Hello " + name;
    }

    public String like(String name){
        return "dubbo like " + name;
    }
}
