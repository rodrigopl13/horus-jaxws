package com.ws.faults;

import com.domain.exceptions.CustomException;
import com.domain.models.MyFaultBean;

import javax.jws.WebService;

@WebService
public class CustomFaultWS {

    public String createFoo(String param) throws CustomException {
        if(param.equalsIgnoreCase("exception")){
            MyFaultBean fault = new MyFaultBean();
            fault.setFaultString("FaultString");
            fault.setFaultCode("FaultCode");
             throw  new CustomException("Message Exception", fault);
        }
        return "Hello from CustomFaultWS "+ param;
    }

}
