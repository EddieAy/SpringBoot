package zera.service.impl;

import org.springframework.stereotype.Service;
import zera.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println(name+"执行了sayHello");
    }
}
