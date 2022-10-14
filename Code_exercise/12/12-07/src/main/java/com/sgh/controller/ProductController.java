package com.sgh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    /**
     * 获取商品列表
     */
    @RequestMapping("/getProducts")
    public void getProducts(String[] proIds) {
        for (String proId : proIds) {
            System.out.println("获取到了Id为" + proId + "的商品");
        }
    }

}

