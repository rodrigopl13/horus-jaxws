package com.ws.faults;

import com.domain.exceptions.MyException;

import javax.jws.WebService;

@WebService
public class SimpleExceptionWS {

    public String performService(String param) throws MyException {
        if(param.equalsIgnoreCase("exception")){
            throw new MyException("invalid data in SimpleExceptionWS WebService");
        }
        return "Hello from SimpleExceptionWS WebService" + param;
    }

}
