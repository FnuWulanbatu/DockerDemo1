package com.jackwulanbatueurekaserver.dockerdemo1.service;

import com.jackwulanbatueurekaserver.dockerdemo1.model.HelloResponse;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public HelloResponse getHelloMessage() {
        return new HelloResponse("Hello from Docker with layered architecture!");
    }
}
