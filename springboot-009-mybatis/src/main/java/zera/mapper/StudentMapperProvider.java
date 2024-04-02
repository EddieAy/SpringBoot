package zera.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;
import zera.pojo.Student;
import zera.provider.StudentProvider;

public interface StudentMapperProvider {

    @Select("")
    @Results(
            id = "StudentMap",value = {
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "age",property = "age")
    }
    )
    Student selectNothing();

    @UpdateProvider(type = StudentProvider.class,method = "updateStudent")
    int updateById(Integer id,Integer age);
}
