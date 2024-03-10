package com.vv.udemyspring.controller;

// Controller class that invokes the service method
import com.vv.udemyspring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {
        return helloService.sayHello(name);
    }

    @GetMapping("/hello2")
    public String hello2(@RequestParam(required = false) String name) {
        return helloService.sayHello2(name);
    }
}
