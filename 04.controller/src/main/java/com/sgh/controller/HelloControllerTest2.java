package com.sgh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControllerTest2 {

        @RequestMapping("/hello2")
        public String sayHello(Model model){
            //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
            model.addAttribute("msg", "hello,SpringMVC,com from HelloControllerTest2");
            //web-inf/jsp/hello.jsp
            return "hello";
        }

          @RequestMapping("/hello3")
           public String sayHello2(Model model){
            //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
            model.addAttribute("msg", "test3");
            //web-inf/jsp/hello.jsp
            return "hello";
           }


}
