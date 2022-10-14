package com.sgh.controller;

import com.sgh.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class UserController {
    @RequestMapping("/getUserId")
    public void getUserId(HttpServletRequest request) {
        String userid = request.getParameter("userid");
        System.out.println("userid=" + userid);
    }

    @RequestMapping("/getUserNameAndId")
    public void getUserNameAndId(String username, Integer id) {
        System.out.println("username=" + username + ",id=" + id);
    }
    
    /**
     * @RequestParam：将请求参数绑定到你控制器的方法参数上（是springmvc中接收普通参数的注解）
	 *		语法：@RequestParam(value=”参数名”,required=”true/false”,defaultValue=””)
	 *		value：参数名
	 *		required：是否包含该参数，默认为true，表示该请求路径中必须包含该参数，如果不包含就报错。
	 *		defaultValue：默认参数值，如果设置了该值，required=true将失效，自动为false,如果没有传该参数，就使用默认值
     */
    @RequestMapping("/getUserName1")
    public void getUserName1(@RequestParam(value="name") String username) {
        System.out.println("username=" + username );
    }
    @RequestMapping("/getUserName2")
    public void getUserName2(@RequestParam(value="name",required=false) String username) {
        System.out.println("username=" + username );
    }
    @RequestMapping("/getUserName3")
    public void getUserName3(@RequestParam(value="name",required=false,defaultValue= "com/sgh")
    										String username) {
        System.out.println("username=" + username );
    }
    
    /**
	 *	@PathVariable
	 *	@PathVariable是用来获得请求url中的动态参数的，即接收请求路径中占位符的值，
	 *		映射URL绑定的占位符，带占位符的URL是 Spring3.0 新增的功能，URL中的 {xxx} 占位符可以通过 @PathVariable("xxx") 
	 *		绑定到操作方法的入参中。
	 *	语法：@PathVariable("xxx")通过 @PathVariable 可以将URL中占位符参数{xxx}绑定到处理器类的方法形参中@PathVariable(“xxx“)
	 *	如1：
	 *	@RequestMapping("/user/{id}/{name}/{password}")
	 *	请求路径：http://localhost:8080/chapter12-02/1003/tom/123456
	 *	 如2：
	 *	@RequestMapping("/user/{name}")
	 *	请求路径：http://localhost:8080/chapter12-02/tom
     */
    @RequestMapping("/user/{name}")
    public void getPathVariable(@PathVariable(value = "name")
                                        String username) {
        System.out.println("username=" + username);
    }

    /**
     * 接收表单用户信息
     */
    @RequestMapping("/registerUser")
    public void registerUser(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        System.out.println("username=" + username + ",password=" + password);
    }
    
    /**
     * 使用自定义类型数据绑定日期数据
     */
    @RequestMapping("/getBirthday1")
    public void getBirthday1(Date birthday) {
        System.out.println("birthday="+birthday);
    }
    
    /**
     * 使用@DateTimeFormat注解绑定日期数据
     */
    @RequestMapping("/getBirthday2")
    public void getBirthday2(@DateTimeFormat(
            pattern = "yyyy-MM-dd") Date birthday) {
        System.out.println("birthday=" + birthday);
    }
    @RequestMapping("/getBirthday3/{b}")
    public String getBirthday3(@PathVariable(value = "b")Date birthday, Model model) {

        System.out.println("birthday="+birthday);
        model.addAttribute("message",birthday);

        return "test";
    }

}

