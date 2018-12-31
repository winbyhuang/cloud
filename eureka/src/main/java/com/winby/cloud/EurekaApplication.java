package com.winby.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Winby
 * @date 2018/12/29  17:20
 * @update
 * @since v1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
@RestController
@RefreshScope
public class EurekaApplication {
    @Value("cloud.eureka.peer.port")
    String value;

    @Autowired
    Environment environment;

    @RequestMapping("he")
    public String he(){
        return environment.getProperty("cloud.eureka.peer.name");
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
