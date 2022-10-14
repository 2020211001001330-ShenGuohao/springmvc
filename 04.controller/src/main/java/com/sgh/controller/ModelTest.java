package com.sgh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest {


    @RequestMapping("m1/t1")
    public String hello1(Model model){

        model.addAttribute("msg","hello ModelTest_1");


        //重定向
        return "redirect:/WEB-INF/jsp/hello.jsp";
    }

    @RequestMapping("m1/t2")
    public String hello2(Model model){

        model.addAttribute("msg","hello ModelTest_2");


        //转发
        return "forward:/WEB-INF/jsp/hello.jsp";
    }



}
