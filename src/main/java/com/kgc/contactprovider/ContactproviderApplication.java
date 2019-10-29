package com.kgc.contactprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
public class ContactproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContactproviderApplication.class, args);
    }

}
