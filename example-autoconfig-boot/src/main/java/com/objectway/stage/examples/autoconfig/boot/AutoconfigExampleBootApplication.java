package com.objectway.stage.examples.autoconfig.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutoconfigExampleBootApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(AutoconfigExampleBootApplication.class, args);
    }

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello, world!");
        System.out.println(applicationContext.getBeanDefinitionCount());
        System.out.println(applicationContext.getBeanDefinitionNames());
    }
}
