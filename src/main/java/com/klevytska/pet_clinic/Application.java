package com.klevytska.pet_clinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

/**
 * Created by klevytska on 09/02/2017.
 */

@ComponentScan
@EnableJpaRepositories
@Import(RepositoryRestConfiguration.class)
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
