package zera;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import zera.pojo.Student;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Bean
    public Student getStudent(){
        Student student = new Student();
        student.setAge(16);
        student.setName("Cris");
        return student;
    }
}
