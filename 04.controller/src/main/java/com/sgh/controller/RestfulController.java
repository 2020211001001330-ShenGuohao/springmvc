package com.sgh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestfulController {

//    @RequestMapping(value= "/add/{a}/{b}",method = RequestMethod.GET)
//    public String sayHello(@PathVariable int a,@PathVariable int b, Model model){
//        int res=a+b;
//
//        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
//        model.addAttribute("msg", a+"+"+b+"结果为:"+res);
//        //web-inf/jsp/hello.jsp
//        return "hello";
//    }
    @GetMapping ("/add/{a}/{b}")
    public String sayHello1(@PathVariable int a,@PathVariable int b, Model model){
        int res=a+b;

        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg", a+"+"+b+"结果1为:"+res);
        //web-inf/jsp/hello.jsp
        return "hello";
    }

    @PostMapping("/add/{a}/{b}")
    public String sayHello2(@PathVariable int a,@PathVariable int b, Model model){
        int res=a+b;

        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg", a+"+"+b+"结果2为:"+res);
        //web-inf/jsp/hello.jsp
        return "hello";
    }


}
