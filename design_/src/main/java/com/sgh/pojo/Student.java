package com.sgh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private String id;
    private String name;
    private  int   age;
    private  String sex;
    private  String cno;

}
