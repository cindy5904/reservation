package org.example.starter_app2;

import org.example.starter_app2.config.InfraConfig;
import org.example.starter_app2.config.RestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        SpringApplication infra = new SpringApplication(InfraConfig.class);
        infra.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
        ConfigurableApplisetcat ionContext infraContext = infra.run();



        SpringApplication rest = new SpringApplication(RestConfig.class);
        rest.setDefaultProperties(Collections.singletonMap("server.port", "8082"));
        rest.addInitializers(new RestAppInitializer(infraContext));
        ConfigurableApplicationContext restContext = rest.run();
    }
    }
