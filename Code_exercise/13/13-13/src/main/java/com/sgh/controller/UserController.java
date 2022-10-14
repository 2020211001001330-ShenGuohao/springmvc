package com.sgh.controller;

import com.sgh.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class UserController {
	//数据校验使用@valid,后面跟着errors对象保存校验信息
	@RequestMapping(value="/test")
	public String regist(@Valid User user,Errors errors,Model model){
		if(errors.hasErrors()){
			//获取所有的错误信息 ,FieldError包含错误的属性，错误信息
			List<FieldError> fieldErrors = errors.getFieldErrors();

			//存放错误信息:key=错误信息的属性名 value=错误信息，这样就有利于在jsp中分别取出map中存储的错误信息
			Map<String,String> map =new HashMap<String,String>();
			//循环转移到map中
			for (FieldError fieldError :fieldErrors){
				//fieldError.getField()是属性名
				//fieldError.getDefaultMessage()验证失败的错误信息
				map.put(fieldError.getField(),fieldError.getDefaultMessage());
			}
			model.addAttribute("map", map);
			
			return "regist";
		}
		model.addAttribute("user",user);
		return "success";
		
	}
}
