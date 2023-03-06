package by.kuchinskiy.cldexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {
    @GetMapping("test")
    public String getHello(){
        return "hello world!";
    }
}
