package com.zetcode.service;

//http://localhost:8086/api/hello

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.springframework.stereotype.Service;
/**
 * @Service for autodetection.
 */
@Service
@Path("/hello")
public class HelloService {

    /**
     * service method
     *
     * @Path annotation defines the URL to which the service class will respond.
     * @return "Hello from Spring" message.
     */
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello from Spring";
    }
}