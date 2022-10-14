package com.sgh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("demo1")
    public String hello1() {
        System.out.println("HelloController...Hello1");
        return "success.jsp";
    }

    @RequestMapping("demo2")
    public String hello2() {
    	System.out.println("HelloController...Hello2");
        return "success.jsp";
    }
    
    @RequestMapping("demo3")
    public String exp() {
        System.out.println(1 / 0);
        return "success.jsp";
    }
}

