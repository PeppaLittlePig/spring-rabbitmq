package com.wangzh.springrabbit.rabbitmq.listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * USER:  Wangzh
 * DATE:  2018/1/19
 * TIME:  16:45
 */
@Component
public class  DirectListener01{

    Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 监听队列
     * @param msg
     * @throws Exception
     */
    @RabbitListener(queues = "test_direct_queue")
    public void receive(String msg) throws Exception {
        logger.info("DirectListener01 receive msg:"+msg);
    }
}
