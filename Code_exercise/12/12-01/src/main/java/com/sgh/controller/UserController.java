package com.sgh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @RequestMapping("/getUserId")
    public String getUserId(HttpServletRequest request,Model model) {
        String userid = request.getParameter("userid");
        System.out.println("userid=" + userid);
        model.addAttribute("message",userid);
        return "test";
    }

}

