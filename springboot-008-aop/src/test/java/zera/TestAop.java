package zera;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import zera.service.MyService;

@SpringBootTest
public class TestAop {

    @Resource
    private MyService myService;

    @Test
    public void test1(){
        myService.generate();
    }
}
