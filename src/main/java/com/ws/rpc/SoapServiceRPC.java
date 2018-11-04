package com.ws.rpc;

import com.domain.models.Movie;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import  java.util.Map;

@WebService(portName = "rpcPort", serviceName = "rpcService")
@SOAPBinding(style = SOAPBinding.Style.RPC, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED,
    use = SOAPBinding.Use.LITERAL)
public class SoapServiceRPC {

    private static Map<Integer, Movie> map = new HashMap<Integer, Movie>();

    public Movie addMovie(Movie movie){
        int id = map.size()+1;
        movie.setId(id);
        map.put(id, movie);
        return movie;
    }

    public Movie retrieveMovie(int id){
        if (map.containsKey(id)){
            return map.get(id);
        }else
            return null;
    }

}
