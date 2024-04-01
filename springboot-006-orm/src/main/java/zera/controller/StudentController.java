package zera.controller;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zera.pojo.Student;
import zera.service.StudentService;

@Controller
public class StudentController {


    @Resource
    private StudentService studentService;
    @RequestMapping("/student/query")
    @ResponseBody
    public String selectStudentById(Integer id){
        Student student = studentService.selectStudentById(id);
        return student.toString();
    }
}
