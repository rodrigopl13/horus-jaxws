package com.ws.document;



import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED,
 use = SOAPBinding.Use.LITERAL)
public class SoapDocumentWrapped {

    public  String[] generateStrings(String cadena, int times, char seek, char replace){
        String[] array = new String[times];
        for (int i = 0; i<times; i++){
            array[i] = containsAndReplace(cadena,seek,replace);
        }
        return array;
    }


    private String containsAndReplace(String cadena, char seek, char replace){
        char[] a = cadena.toCharArray();
        boolean isChanged = false;
        for (int i = 0; i<a.length; i++) {
            if (a[i] == seek){
                a[i] = replace;
            }
        }
        if(isChanged)
            return new String(a);
        return cadena;
    }
}

