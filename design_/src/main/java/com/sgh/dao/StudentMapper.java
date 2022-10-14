package com.sgh.dao;

import com.sgh.pojo.Student;
import com.sgh.pojo.Update_Stu_Data;

import java.util.List;

public interface StudentMapper {

    List<Student>getAllStudent();

    Student getStudentById(String id);

    void insert_Student(Student student);

    void delete_Student(String id);

    void update_Student(Update_Stu_Data updateStuData);

}
