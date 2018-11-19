package com.ws.security;


import javax.annotation.security.DeclareRoles;
import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.jws.WebService;

@WebService
@DeclareRoles("manager")
public class SOAPBasicAuth {

    @RolesAllowed("manager")
    public String onlyManagers(){
        return "Hello Manager";
    }

    @RolesAllowed("employee")
    public String onlyEmployees(){
        return "Hello Employee";
    }

    @PermitAll
    public String allRoles(){
        return "Hello whoever you are";
    }

    @DenyAll
    public String noneRoles(){
        return "no one can call me";
    }
}
