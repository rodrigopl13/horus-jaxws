package com.ws.document;


import com.domain.models.Movie;
import com.domain.models.MovieCategories;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.BARE,
use = SOAPBinding.Use.LITERAL)
public class SoapDocumentBare {

    private static Map<Integer, Movie> map = new HashMap<Integer, Movie>();

    @WebResult(name = "movieResponse")
    public Movie addMovie(@WebParam(name="movie") Movie movieRequest){
        int movieId = map.size()*1;
        movieRequest.setId(movieId);
        map.put(movieId, movieRequest);
        return movieRequest;
        //return "Added";
    }

}
