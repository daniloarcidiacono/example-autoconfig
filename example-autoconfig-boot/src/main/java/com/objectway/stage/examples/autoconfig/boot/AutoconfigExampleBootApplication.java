package com.objectway.stage.examples.autoconfig.boot;

import com.objectway.stage.examples.autoconfig.library.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoconfigExampleBootApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(AutoconfigExampleBootApplication.class, args);
    }

    @Autowired
    private Greeter greeter;

    @Override
    public void run(String... args) {
        String message = greeter.greet();
        System.out.println(message);
    }
}
