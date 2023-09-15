package com.jonty070.learn.consumer;

import com.jonty070.learn.config.CommunicationConfig;
import com.jonty070.learn.dto.StudentStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
//you may want to create separate application/microservice to use/consume the queue messages
public class ParentsConsumer {
    @RabbitListener(queues = CommunicationConfig.QUEUE)
    public void consumerMessageFromQueue(StudentStatus studentStatus){
        System.out.println("Message received from queue: "+studentStatus);
    }
}
