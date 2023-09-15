package com.jonty070.learn.publisher;

import com.jonty070.learn.config.CommunicationConfig;
import com.jonty070.learn.dto.Student;
import com.jonty070.learn.dto.StudentStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/student")
public class StudentPublisher {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/")
    public String verdictStudent(@RequestBody Student student,@RequestParam String schoolName){

        student.setStudentId(UUID.randomUUID().toString());
        //In real scenario, microservice world for eg:
        //this will go to MarkingService
        //ResultDecider service
        //for now building the studentstatus directly
        StudentStatus studentStatus = new StudentStatus(student,"PASSED",
                "student passed successfully with 89%"+schoolName);
        System.out.println("hey just checking for request");
        rabbitTemplate.convertAndSend(CommunicationConfig.EXCHANGE,CommunicationConfig.ROUTING_KEY,studentStatus);
        return "Eureka !!!";
    }
}
