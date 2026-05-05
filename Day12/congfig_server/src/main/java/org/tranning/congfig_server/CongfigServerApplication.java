package org.tranning.congfig_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CongfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CongfigServerApplication.class, args);
    }

}
