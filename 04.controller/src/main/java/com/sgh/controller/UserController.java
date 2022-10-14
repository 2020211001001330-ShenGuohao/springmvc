package com.sgh.controller;


import com.sgh.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping("/t1")
    public String hello(@RequestParam("username") String name, Model model){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "hello";
    }

    @RequestMapping("/user")
    public String user(User user,Model model){
        System.out.println(user);
        model.addAttribute("msg",user);
        return "hello";
    }


}
