package zera;

import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import zera.service.UserService;

@SpringBootApplication()
public class Application implements CommandLineRunner {

    @Resource
    private UserService userService;

    public static void main(String[] args) {

        System.out.println("容器创建前");

        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("容器创建后");
    }


    @Override
    public void run(String... args) throws Exception {
        userService.sayHello("qwer");
        System.out.println("容器创建好后，执行的方法");
    }
}
