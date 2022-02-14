package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 18149 on 2022/2/12.
 */
@Controller
public class TestController {

    @RequestMapping("/index")
    public String testC(){
        return "index";
    }
}
