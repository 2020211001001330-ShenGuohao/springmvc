package com.sgh.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.sgh.pojo.Histogram;
import com.sgh.pojo.User;
import com.sgh.utils.JsonUtils;
import lombok.val;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller  方法不注明 @ResponseBody 会走视图解析器1
@RestController //作用等同于@Controller + @ResponseBody。方法不需要在声明 @ResponseBody
public class UserController {


    //produces:指定响应体返回类型和编码
//    @RequestMapping(value = "/json1",produces = "application/json;charset=utf-8")  //设置返回编码格式


//    @ResponseBody    //不再经过视图解析器
    @RequestMapping(value = "/json1")
    public User json1() throws JsonProcessingException {
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("秦疆1号", 3, "男");
        //将我们的对象解析成为json格式
//        String str = mapper.writeValueAsString(user);
        //由于@ResponseBody注解，这里会将str转成json格式返回；十分方便

        return user;
    }

    @RequestMapping("/json2")
    public String json2() throws JsonProcessingException {


        //创建一个对象
        User user1 = new User("秦疆1号", 3, "男");
        User user2 = new User("秦疆2号", 3, "男");
        User user3 = new User("秦疆3号", 3, "男");
        User user4 = new User("秦疆4号", 3, "男");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        //将我们的对象解析成为json格式
        String str = JsonUtils.getJson(list);
        return str;
    }

    @RequestMapping("/json_2")
    public List<User> json_2() throws JsonProcessingException {

        //创建一个对象
        User user1 = new User("张三", 18, "男");
        User user2 = new User("李四", 19, "男");
        User user3 = new User("王五", 18, "女");
        User user4 = new User("路六", 20, "男");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);


        return list;
    }



    @RequestMapping("/json3")
    public String json3() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        //创建时间一个对象，java.util.Date
        Date date = new Date();
        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(date);
        /*
           默认日期格式会变成一个数字，是1970年1月1日到当前日期的毫秒数！
           Jackson 默认是会把时间转成timestamps形式
        */
        return str;
    }


    //取消timestamps形式 ， 自定义时间格式
    @RequestMapping(value = "/json4")
    public String json4() throws JsonProcessingException {
        /*
            //创建一个jackson的对象映射器，用来解析数据
            ObjectMapper mapper = new ObjectMapper();
            //创建一个对象
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            //将我们的对象解析成为json格式
            String str = mapper.writeValueAsString(simpleDateFormat.format(date));
            //由于@ResponseBody注解，这里会将str转成json格式返回；十分方便
        */


        /*
                 //创建一个jackson的对象映射器，用来解析数据
                ObjectMapper mapper = new ObjectMapper();
                //不使用时间戳的方式
                mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
                //自定义日期格式对象
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                //指定日期格式
                mapper.setDateFormat(sdf);
           */
        Date date = new Date();
        String str = JsonUtils.getJson(date);
        return str;
    }

    @RequestMapping(value = "/json_test")
    public JSONObject json_test() throws JsonProcessingException {
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象

        double [] x=new double[]{1,2,3,4,5};
        double [] y=new double[]{10,20,30,40,50};

        Histogram histogram = new Histogram(x, y);
        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(histogram);
        //由于@ResponseBody注解，这里会将str转成json格式返回；十分方便

        return JSON.parseObject(str);
    }

}
