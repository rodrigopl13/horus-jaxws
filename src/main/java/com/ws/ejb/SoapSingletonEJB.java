package com.ws.ejb;

import javax.ejb.Singleton;
import javax.jws.WebService;

@WebService
@Singleton
public class SoapSingletonEJB {

    public String sayHello(){
        return "Hello from singleton";
    }
}
