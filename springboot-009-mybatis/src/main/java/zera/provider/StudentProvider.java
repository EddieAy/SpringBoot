package zera.provider;

public class StudentProvider {

    public static String updateStudent(){
        return """
                update t_stu set age = #{age} where id = #{id}
                """;
    }
}
