package com.example.demo.testserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyServer {

    @ResponseBody
    @RequestMapping("/my")
    public String my() {
        return "myServer";
    }
}
