package com.wangzh.springrabbit.controller;

import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * USER:  Wangzh
 * DATE:  2018/1/19
 * TIME:  16:50
 */
@Controller
@RequestMapping("/rabbit")
public class RabbitController {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("/direct")
    @ResponseBody
    public String direct(String msg){
        rabbitTemplate.convertAndSend("exchange-direct","test_direct_queue_key",msg);
        return "done";
    }
}
