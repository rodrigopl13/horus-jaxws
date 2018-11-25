package com.ws.async;

import com.domain.exceptions.CustomException;
import com.domain.models.Movie;
import com.domain.models.MyFaultBean;

import javax.ejb.Singleton;
import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@WebService
@Singleton
public class SoapAsyncEJB {

    Map<Integer, Movie> map = new HashMap<>();

    public Movie addMovie(Movie request){

        int id = map.size() + 1;
        request.setId(id);
        map.put(id,request);
        return map.get(id);
    }

    public Movie getMovie(int id) throws CustomException {
        if(!map.containsKey(id)){
            MyFaultBean fault = new MyFaultBean();
            fault.setFaultString("Movie not found");
            fault.setFaultCode("NotFound");
            throw  new CustomException("Id provide for the movie wasn't found", fault);
        }
        return map.get(id);
    }

}
