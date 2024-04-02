package zera;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zera.mapper.StudenMapperOneToOne;
import zera.mapper.StudentMapper;
import zera.mapper.StudentMapperProvider;
import zera.pojo.Student;
import zera.pojo.StudentWithCar;

import java.util.List;

@SpringBootTest
public class TestMybatis {

    @Autowired
    private StudentMapper studentMapper;
    @Test
    public void test1(){
        Student student = studentMapper.selectById(1);
        System.out.println(student);

        Student s1 = new Student(124,"Toros",17);
        int insert = studentMapper.insert(s1);
        System.out.println(insert);


    }

    @Test
    public void test2(){
        int update = studentMapper.updateById(4, 19);
        System.out.println(update);
    }

    @Test
    public void test3(){
        List<Student> res = studentMapper.selectAll();
        for (Student s:res){
            System.out.println(s);
        }
    }

    @Test
    public void test4(){
        int delete = studentMapper.deleteById(5);
        System.out.println(delete);
    }


    @Resource
    private StudentMapperProvider studentMapperProvider;
    @Test
    public void test5(){
        int update = studentMapperProvider.updateById(4, 21);
        System.out.println(update);
    }

    @Resource
    private StudenMapperOneToOne studenMapperOneToOne;
    @Test
    public void test6(){
        StudentWithCar studentWithCar = studenMapperOneToOne.selectStudentById(1);
        System.out.println(studentWithCar);
    }
}
