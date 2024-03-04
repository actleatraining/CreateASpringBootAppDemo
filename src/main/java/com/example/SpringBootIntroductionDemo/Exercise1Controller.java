package com.example.SpringBootIntroductionDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise1Controller {

    @GetMapping("/")
    String test() {
        return "Hello World!!!";
    }

    @GetMapping("/ex2")
    String hello(@RequestParam String name) { // Required request param
        return "Hello " + name;
    }

    @GetMapping("/ex3")
    String hello3(@RequestParam(required=false, defaultValue = "Stranger") String name) { // Not required request param
        return "Hello " + name + "!";
    }

    @GetMapping("/ex4/{name}")
    String hello4(@PathVariable String name) { // Path variable
        return "Hello " + name;
    }
}
