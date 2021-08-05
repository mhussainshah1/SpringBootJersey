package com.zetcode.service;

//http://localhost:8086/api/reverse?data=summer

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.springframework.stereotype.Service;

@Service
@Path("/reverse")
public class ReverseService {

    /**
     * service method
     *
     * @QueryParam binds the value(s) of a HTTP query parameter to a resource method parameter.
     * @param data It cannot be null.
     * @return a string which is reversed.
     */
    @GET
    @Produces("text/plain")
    public String reverse(@QueryParam("data") @NotNull String data) {
        return new StringBuilder(data).reverse().toString();
    }
}