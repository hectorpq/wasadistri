package com.example.msregistryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaServer
public class MsRegistryServerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MsRegistryServerApplication.class, args);
        String port = context.getEnvironment().getProperty("server.port");
        System.out.println(">>> Puerto configurado en Spring Boot: " + port);
    }
}
