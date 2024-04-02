package zera.mapper;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import zera.pojo.Car;
import zera.pojo.Student;
import zera.pojo.StudentWithCar;

public interface StudenMapperOneToOne {

    @Select("""
    select * from t_car where id = #{id}
""")
    Car selectCarById(Integer id);

    @Select("""
    select id,name,age from t_stu where id = #{id}
""")
    @Results(
            {@Result(id = true,column = "id",property = "id"),
                    @Result(column = "name",property = "name"),
                    @Result(column = "age",property = "age"),
                    @Result(column = "id",property = "car",
                            one = @One(
                                    select = "zera.mapper.StudenMapperOneToOne.selectCarById",fetchType = FetchType.LAZY
                            ))
            }
    )
    StudentWithCar selectStudentById(Integer id);

}
