package zera.dao;

import org.apache.ibatis.annotations.Mapper;
import zera.pojo.Student;


@Mapper
public interface StudentDao {
    Student selectById(Integer id);
}
