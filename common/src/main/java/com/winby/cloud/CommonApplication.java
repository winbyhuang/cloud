package com.winby.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Winby
 * @date 2018/12/29  17:20
 * @update
 * @since v1.0.0
 */
@SpringBootApplication
public class CommonApplication {
    @Value("cloud.eureka.peer.port")
    String value;
    @Value("myww")
    String my;

    @Autowired
    Environment environment;
    @RequestMapping("he")
    public String he(){
        return my;
//        return environment.getProperty("server.port");
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(CommonApplication.class, args);
    }

}
