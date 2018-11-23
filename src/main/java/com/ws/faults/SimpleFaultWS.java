package com.ws.faults;

import javax.jws.WebService;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.SOAPFaultException;

@WebService
public class SimpleFaultWS {

    public String calculateService(String param) throws WebServiceException {
        if(param.equalsIgnoreCase("exception")){
            try {
                SOAPFactory factory = SOAPFactory.newInstance();
                SOAPFault fault = factory.createFault();
                fault.setFaultCode("faultCode CalculateService");
                fault.setFaultString("faultString CalculateService");
                fault.setFaultActor("faultActor CalculateService"); //not Mandatory
                //fault.addDetail().addDetailEntry(fault.createQName("local name","prefix")); // not mandatory
                throw new SOAPFaultException(fault);
            } catch (SOAPException e) {
                throw new WebServiceException(e.getMessage());
            }
        }
        return "Hello from SimpleFaultWS "+ param;
    }

}
