package com.sgh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    /**
     * 获取商品列表(使用List绑定数据)
     */
    @RequestMapping("/getProducts")
    public void getProducts(@RequestParam("proIds") List<String> proIds) {
        for (String proId : proIds) {
            System.out.println("获取到了Id为" + proId + "的商品");
        }
    }
}

