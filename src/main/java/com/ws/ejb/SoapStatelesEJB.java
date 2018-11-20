package com.ws.ejb;

import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService
@Stateless
public class SoapStatelesEJB {

    public String sayHello(){
        return "Hello from stateles EJB";
    }
}
