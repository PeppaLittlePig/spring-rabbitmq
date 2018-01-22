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
 * TIME:  9:47
 */
@Component
public class TopicListener1 {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitListener(queues = "test_topic_queue_1")
    public void displayTopic(String msg) throws IOException {
        logger.info("TopicListener1 receive msg:"+msg);
    }
}
