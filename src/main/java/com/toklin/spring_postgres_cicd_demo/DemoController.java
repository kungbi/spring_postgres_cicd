package com.toklin.spring_postgres_cicd_demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoController {

    @GetMapping()
    public String getHello() {
        return "Hello World!";
    }

    @GetMapping("/world")
    public String getHello2() {
        return "Hello World! word";
    }

}
