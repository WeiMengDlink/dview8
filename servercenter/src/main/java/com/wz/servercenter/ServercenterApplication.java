package com.wz.servercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ServercenterApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServercenterApplication.class, args);
    }
}
