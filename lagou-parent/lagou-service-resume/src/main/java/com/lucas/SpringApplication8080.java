package com.lucas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

/**
 * @program: lagou-parent
 * @author: lucasLu
 **/
@SpringBootApplication
@EntityScan("com.lucas.pojo")
public class SpringApplication8080 {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplication8080.class,args);
    }
}
