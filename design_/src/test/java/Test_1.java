import com.sgh.dao.StudentMapper;
import com.sgh.pojo.Student;
import com.sgh.pojo.Update_Stu_Data;
import com.sgh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Test_1 {


    @Test
    public void test_query(){

        SqlSession session = MybatisUtils.getSession();
        //方法二:

        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students= mapper.getAllStudent();
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }

    @Test
    public void test_insert(){

        SqlSession session = MybatisUtils.getSession();
        //方法二:

        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student student=new Student();
        student.setId("005");
        student.setName("xxx");
        student.setAge(21);
        student.setSex("女");
        student.setCno("1");
        mapper.insert_Student(student);
        System.out.println(student+"INSERT OK!!!");

        session.close();
    }

    @Test
    public void test_delete(){

        SqlSession session = MybatisUtils.getSession();
        //方法二:

        StudentMapper mapper = session.getMapper(StudentMapper.class);
        mapper.delete_Student("005");
        System.out.println("DELETE OK!!!");

        session.close();
    }

    @Test
    public void test_update(){

        SqlSession session = MybatisUtils.getSession();
        //方法二:

        StudentMapper mapper = session.getMapper(StudentMapper.class);
        String before_id="006";

        Update_Stu_Data data=new Update_Stu_Data();
        data.setBefore_id(before_id);
        data.setAfter_id("001");
        data.setName("沈国浩");
        data.setSex("男");
        data.setAge(21);
        data.setCno("8");

        mapper.update_Student(data);


        System.out.println("UPDATA OK!!!");

        session.close();
    }



}
