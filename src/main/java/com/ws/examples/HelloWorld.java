package com.ws.examples;

import javax.jws.WebService;

@WebService
public class HelloWorld {

    public String hello(String name, String lastNAme){
        return "Hello "+name+" "+lastNAme;
    }

}
