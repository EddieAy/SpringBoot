package zera.service.impl;

import org.springframework.stereotype.Service;
import zera.service.MyService;


@Service
public class MyServiceImpl implements MyService {
    @Override
    public void generate() {
        System.out.println("正在生成订单");
    }

    @Override
    public void delete() {
        System.out.println("正在删除订单");
    }
}
