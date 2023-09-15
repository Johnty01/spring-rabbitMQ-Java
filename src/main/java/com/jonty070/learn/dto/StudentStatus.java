package com.jonty070.learn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentStatus {
    private Student student;
    private String  status; // passed/failed
    private String message;

}
