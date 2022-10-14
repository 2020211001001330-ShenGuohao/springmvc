package com.sgh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class HelloController {

    //真实访问地址 : 项目名/HelloController/hello
    @RequestMapping("/t1")
    public String sayHello(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVC");
        //web-inf/jsp/hello.jsp
        return "hello";
    }
    @RequestMapping("/update")
    public String sayHello1(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","测试,调用更新页面");
        //web-inf/jsp/hello.jsp
        return "test";
    }

}
