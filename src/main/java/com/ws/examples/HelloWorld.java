package com.ws.examples;

import javax.jws.WebService;

@WebService
public class HelloWorld {

    public String hello(String name){
        return "Hello "+name;
    }

}
