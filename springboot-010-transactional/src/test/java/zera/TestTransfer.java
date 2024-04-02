package zera;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import zera.service.AccountService;
import zera.service.impl.AccountServiceImpl;

@SpringBootTest
public class TestTransfer {

    @Resource
    private AccountService accountService;

    @Test
    public void test1() {
        accountService.transfer("act1","act2",10000.0);
    }
}
