package com.sgh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {

    @RequestMapping("test1")
    public String test_1(Model model){

        model.addAttribute("message","测试成功");

        return "test";
    }

}
