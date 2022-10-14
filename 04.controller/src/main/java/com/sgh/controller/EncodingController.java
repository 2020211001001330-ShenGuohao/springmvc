package com.sgh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncodingController {
    @RequestMapping("/e/t")
    public String test(Model model, String test){
        System.out.println(test);
        model.addAttribute("msg",test); //获取表单提交的值
        return "hello"; //跳转到test页面显示输入的值
    }
}
