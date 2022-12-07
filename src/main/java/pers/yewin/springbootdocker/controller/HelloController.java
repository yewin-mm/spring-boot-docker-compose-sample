package pers.yewin.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Ye Win
 * @created: 05/11/2022
 * @project: spring-boot-docker-compose-sample
 * @package: pers.yewin.springbootdocker.controller
 */

@RestController
public class HelloController {

    /**
     * This is demo project for docker and so, I won't add many APIs and logic.
     */

    @GetMapping("/getHello")
    public String getHello(){
        System.out.println("Hello print");
        return "Hello from Dockerized Application";
    }
}
