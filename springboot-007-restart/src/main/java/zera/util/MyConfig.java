package zera.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyConfig {

    @Autowired
    private Environment environment;

    public void printInfo(){
        String appName = environment.getProperty("app.name");
        String appPort = environment.getProperty("app.port");
        System.out.println("name + port" + appName + appPort);
        System.out.println("123123213213123");
    }

    public void printYml(){
        System.out.println(environment.getProperty("spring.redis.host"));
    }
}
