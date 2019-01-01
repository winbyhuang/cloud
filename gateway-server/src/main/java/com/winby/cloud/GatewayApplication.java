package com.winby.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Winby
 * @date 2018/12/29  17:20
 * @update
 * @since v1.0.0
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableConfigServer
//@EnableDiscoveryClient
public class GatewayApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(GatewayApplication.class, args);
    }

}
