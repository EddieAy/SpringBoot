package zera;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import zera.bean.AppBean;
import zera.bean.SecurityBean;
import zera.service.MyService;
import zera.util.MyConfig;

@SpringBootTest()
public class TestFile {

    @Autowired
    private MyService myService;

    @Autowired
    private MyConfig myConfig;

    @Autowired
    private AppBean appBean;

    @Test
    public void test01(){
        System.out.println(myService);
    }

    @Test
    public void test2(){
        myConfig.printInfo();
    }
    @Test
    public void test3(){
        myConfig.printYml();
    }

    @Test
    public void test4(){
        System.out.println(appBean.toString());
        System.out.println(appBean.getClass());
    }


    @Autowired
    private SecurityBean securityBean;
    @Test
    public void test5(){
        System.out.println(securityBean);
    }
}
