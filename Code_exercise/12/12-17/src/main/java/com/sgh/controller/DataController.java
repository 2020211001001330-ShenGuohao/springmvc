package com.sgh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
public class DataController {
    @RequestMapping("showDataByResponse")
    public void showDataByResponse(HttpServletResponse response) {
        try {
            response.getWriter().print("response");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

