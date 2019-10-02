package com.example.demo.hello;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
public class Hello {

    @ResponseBody
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello() {

        PersonBean personBean = new PersonBean();
        personBean.setName("ms");
        personBean.setAge(12);
        return new Gson().toJson(personBean).toString();
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<h1>Docker Hello World</h1>";
    }

    @RequestMapping("/home")
    @ResponseBody
    public String home() {
        return "<h1>Home</h1>";
    }

    // 请求体
    @RequestMapping(value = "/body", method = RequestMethod.POST)
    public String setterMessage2(@RequestBody String message) {
        System.out.println(message);
        return "{'status':'ok'}";
    }

    //
    @RequestMapping("/date")
    public String date() {
        return new Date().toString();
    }

}
