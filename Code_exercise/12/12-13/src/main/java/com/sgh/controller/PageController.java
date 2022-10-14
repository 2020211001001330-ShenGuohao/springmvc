package com.sgh.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/register")
    public void showPageByVoid() {
        System.out.println("showPageByVoid running-1");
    }
    @RequestMapping("/register2")
    public void showPageByVoid2() {
    	System.out.println("showPageByVoid running-2");
    }
    
    @RequestMapping("/register3")
    public String showPageByVoid3() {
    	System.out.println("showPageByVoid running-3");
    	
    	return "register";
    }
   


}

