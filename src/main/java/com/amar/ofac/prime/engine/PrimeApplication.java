package com.amar.ofac.prime.engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.amar.ofac.prime")
public class PrimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimeApplication.class, args);
    }

}
