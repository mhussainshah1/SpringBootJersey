package com.zetcode.config;

import com.zetcode.service.HelloService;
import com.zetcode.service.ReverseService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {

        register(HelloService.class);
        register(ReverseService.class);
    }
}