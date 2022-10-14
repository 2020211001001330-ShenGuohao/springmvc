package com.sgh.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/register")
    public void showPageByVoid() {
        System.out.println("showPageByVoid running");
    }
    @RequestMapping("/showPageByString")
    public String showPageByString(){
        System.out.println("showPageByString running");
        return "register";
    }
    @RequestMapping("/showPageByForward")
    public String showPageByForward1(){
        System.out.println("showPageByForward running");
        return "forward:orders.jsp";
    }
    @RequestMapping("/showPageByForward1")
    public String showPageByForward2(){
    	System.out.println("showPageByForward running");
    	return "forward:http://www.ecjtu.edu.cn/";
    }
    @RequestMapping("/showPageByRedirect1")
    public String showPageByRedirect1(){
        System.out.println("showPageByRedirect running");
        return "redirect:/orders.jsp";
    }
    @RequestMapping("/showPageByRedirect2")
    public String showPageByRedirect2(){
    	System.out.println("showPageByRedirect running");
    	return "redirect:http://www.ecjtu.edu.cn/";
    }
   
}

