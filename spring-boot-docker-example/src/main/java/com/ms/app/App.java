package com.ms.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class App {


    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<h1>Docker Hello World</h1>";
    }

    @RequestMapping("/home")
    public String home() {
        return "<h1>Home</h1>";
    }

    @RequestMapping(value = "/body", method = RequestMethod.POST)
    public String setterMessage2(@RequestBody String message) {

        System.out.println(message);

        return "{'status':'ok'}";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
