package com.domain.exceptions;

import com.domain.models.MyFaultBean;

import javax.xml.ws.WebFault;

@WebFault(name = "MyCustomFault", targetNamespace = "http://exception.domain.com")
public class CustomException extends Exception {
    private MyFaultBean fault;

    public CustomException(String message, MyFaultBean fault) {
        super(message);
        this.fault = fault;
    }

    public CustomException(String message, Throwable cause, MyFaultBean fault) {
        super(message, cause);
        this.fault = fault;
    }

    public CustomException(String code, String message) {
        super(message);
        this.fault = new MyFaultBean();
        this.fault.setFaultString(message);
        this.fault.setFaultCode(code);
    }

    public MyFaultBean getFault() {
        return fault;
    }
}
