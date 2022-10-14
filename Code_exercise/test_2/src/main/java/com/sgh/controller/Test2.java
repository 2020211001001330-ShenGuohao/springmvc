package com.sgh.controller;


import com.sgh.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test2 {
    @RequestMapping("/test1")
    public String test1(Model model){

        model.addAttribute("message","视图解析成功!");
        return "test";
    }

    @RequestMapping("/test2")
    public String test2(Model model){

        model.addAttribute("message","测试1_GET");
        return "main";
    }

    @PostMapping("/test3")
    public String test3(User user, Model model){

        model.addAttribute("message","测试2_POST<br/>"+user);
        return "test";
    }



}
