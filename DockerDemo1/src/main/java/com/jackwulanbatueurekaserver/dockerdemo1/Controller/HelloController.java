package com.jackwulanbatueurekaserver.dockerdemo1.Controller;

import com.jackwulanbatueurekaserver.dockerdemo1.model.HelloResponse;
import com.jackwulanbatueurekaserver.dockerdemo1.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping
    public HelloResponse sayHello() {
        return helloService.getHelloMessage();
    }
}