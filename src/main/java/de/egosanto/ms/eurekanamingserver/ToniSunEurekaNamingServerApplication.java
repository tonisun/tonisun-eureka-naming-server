package de.egosanto.ms.eurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ToniSunEurekaNamingServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ToniSunEurekaNamingServerApplication.class, args);
    }

}
