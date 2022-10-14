package com.sgh.controller;


import com.sgh.dao.StudentMapper;
import com.sgh.pojo.Student;
import com.sgh.pojo.Update_Stu_Data;
import com.sgh.pojo.User;
import com.sgh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("tologin")
    public String tologin(){

        return "login";
    }

    @PostMapping("login")
    public String login(User user, Model model){

        if(user.getUsername().equals("admin") && user.getPassword().equals("admin")){

            SqlSession session = MybatisUtils.getSession();


            StudentMapper mapper = session.getMapper(StudentMapper.class);
            List<Student> students= mapper.getAllStudent();

            model.addAttribute("res",students);
            session.close();


            return "main";
        }
        model.addAttribute("username",user.getUsername());
        model.addAttribute("message","Username OR Password ERROR !!!");
        return "login";

    }

    @GetMapping("query_Student")
    public String enter_main(Model model){
        SqlSession session = MybatisUtils.getSession();


        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students= mapper.getAllStudent();

        model.addAttribute("res",students);
        session.close();
        return "main";
    }


    @GetMapping("add_Student")
    public String show_add_Student_page(){

        return "add_student";
    }

    @PostMapping("add_Student")
    public String add_Stu(Student student, Model model){
        SqlSession session = MybatisUtils.getSession();


        StudentMapper mapper = session.getMapper(StudentMapper.class);
        mapper.insert_Student(student);
        List<Student> students= mapper.getAllStudent();

        model.addAttribute("res",students);
        session.close();

        return "main";
    }

    @GetMapping("update_Student")
    public String show_update_page(String id, Model model, HttpSession session_){
        SqlSession session = MybatisUtils.getSession();
        session_.setAttribute("beforeId",id);
//        request.setAttribute("beforeId1",id);

        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student studentById = mapper.getStudentById(id);
        System.out.println(studentById);

        model.addAttribute("before",studentById);
        session.close();

        return "update_student";
    }

    @PostMapping("update_Student")
    public String update_Student(Student student, Model model, HttpSession session_){
        SqlSession session = MybatisUtils.getSession();
        String beforeId= (String) session_.getAttribute("beforeId");

//        String beforeId1= (String) request.getAttribute("beforeId1");
//        System.out.println("beforeId=====>"+beforeId);        // ok
//        System.out.println("beforeId_request====>"+beforeId1); //null

        StudentMapper mapper = session.getMapper(StudentMapper.class);

        Update_Stu_Data updateStuData=new Update_Stu_Data();
        updateStuData.setBefore_id(beforeId);
        updateStuData.setAfter_id(student.getId());
        updateStuData.setName(student.getName());
        updateStuData.setAge(student.getAge());
        updateStuData.setSex(student.getSex());
        updateStuData.setCno(student.getCno());

        mapper.update_Student(updateStuData);

        List<Student> students= mapper.getAllStudent();
        model.addAttribute("res",students);
        session.close();


        return "main";
    }



    @GetMapping("delete_Student")
    public String delete_Stu(String id, Model model){
        SqlSession session = MybatisUtils.getSession();


        StudentMapper mapper = session.getMapper(StudentMapper.class);
        mapper.delete_Student(id);

        List<Student> students= mapper.getAllStudent();
        model.addAttribute("res",students);
        session.close();

        return "main";
    }


}
