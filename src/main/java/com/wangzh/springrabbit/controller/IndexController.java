package com.wangzh.springrabbit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * USER:  Wangzh
 * DATE:  2018/1/19
 * TIME:  14:54
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "index";
    }
}
