package zera.mapper;


import org.apache.ibatis.annotations.*;
import zera.pojo.Student;

import java.util.List;

public interface StudentMapper {

    @Select("""
    select id,name,age from t_stu where id = #{id}
""")
    @Results(
            id = "StudentMap",value = {
                    @Result(id = true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "age",property = "age")
    }
    )
    Student selectById(Integer id);

    @Delete("""
    delete from t_stu where id = #{id}
""")
    int deleteById(Integer id);

    @Update("""
    update t_stu set age = #{age} where id = #{id}
""")
    int updateById(Integer id,Integer age);

    @Insert("""
    insert into t_stu(name,age) values (#{name},#{age})
""")
    int insert(Student student);

    @Select("""
    select * from t_stu
""")
    List<Student> selectAll();


}
