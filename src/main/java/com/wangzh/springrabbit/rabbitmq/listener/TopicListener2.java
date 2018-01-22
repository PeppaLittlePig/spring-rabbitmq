package com.wangzh.springrabbit.rabbitmq.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * USER:  Wangzh
 * DATE:  2018/1/22
 * TIME:  9:48
 */
@Component
public class TopicListener2 {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitListener(queues = "test_topic_queue_2")
    public void displayTopic(String msg) throws IOException {
        logger.info("TopicListener2 receive msg:"+msg);
    }
}
