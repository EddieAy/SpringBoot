package zera.service.impl;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zera.dao.StudentDao;
import zera.pojo.Student;
import zera.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Override
    public Student selectStudentById(Integer id) {
        Student student = studentDao.selectById(id);
        return student;
    }
}
