package com.sgh.controller;

import com.sgh.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    /**
     * 获取单个商品信息
     */
    @RequestMapping("/getProduct")
    @ResponseBody
    public void getProduct(@RequestBody Product product) {
        String proId = product.getProId();
        String proName = product.getProName();
        System.out.println("获取到了Id为" + proId + "名称为" + proName + "的商品");

    }

    /**
     * 获取多个商品信息
     */
    @RequestMapping("/getProductList")
    public void getProductList(@RequestBody List<Product> products) {
        for (Product product : products) {
            String proId = product.getProId();
            String proName = product.getProName();
            System.out.println("获取到了Id为" + proId + "名称为" +
                    proName + "的商品");
        }
    }


}

