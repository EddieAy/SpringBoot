package zera;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import zera.service.MyService;
import zera.util.MyConfig;

@SpringBootTest(classes = TestFile.class)
public class TestFile {

    @Autowired
    private MyService myService;

    @Autowired
    private MyConfig myConfig;

    @Test
    public void test01(){
        System.out.println(myService);
    }

    @Test
    public void test2(){
        myConfig.printInfo();
    }
//    @Test
//    public void test3(){
//        myConfig.printYml();
//    }
}
