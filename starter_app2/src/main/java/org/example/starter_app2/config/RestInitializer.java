package org.example.starter_app2.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class RestInitializer implements ApplicationContextInitializer {

    private final ConfigurableApplicationContext infraContext;

    public RestInitializer(ConfigurableApplicationContext infraContext) {
        this.infraContext = infraContext;
    }

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableBeanFactory registry = applicationContext.getBeanFactory();

    }
}
