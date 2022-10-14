package com.sgh.controller;

import com.sgh.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {

    @RequestMapping("/showPageByRequest")
    public String showPageByRequest(HttpServletRequest request){
        System.out.println("showPageByRequest running");
        request.setAttribute("username","request");
        return "register";
    }
    @RequestMapping("/showPageByModel")
    public String showPageByModel(Model model){
        System.out.println("showPageByModel running");
        model.addAttribute("username","model");
        User user = new User();
        user.setPassword("password");
        model.addAttribute("user",user);
        return "register";
    }
   
}

