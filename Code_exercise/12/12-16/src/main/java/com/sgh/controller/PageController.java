package com.sgh.controller;

import com.sgh.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping("/showModelAndView")
    public ModelAndView showModelAndView(){
        //创建ModelAndView实例
        ModelAndView modelAndView = new ModelAndView();
        //向ModelAndView实例中添加名称为username的数据
        modelAndView.addObject("username","ICU");
        User user = new User();
        user.setPassword("password");
        //向ModelAndView实例中添加名称为user的数据
        modelAndView.addObject("user",user);
        //向ModelAndView实例中设置视图的名称
        modelAndView.setViewName("register");
        return modelAndView;
    }
   
}

