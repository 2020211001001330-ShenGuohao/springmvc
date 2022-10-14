package com.sgh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Update_Stu_Data {
    private String before_id;
    private String after_id;
    private String name;
    private  int   age;
    private  String sex;
    private  String cno;
}
