package zera.service;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Value("${app.name}")
    private String name;
    @Value("${app.port}")
    private Integer port;

    @Override
    public String toString() {
        return "MyService{" +
                "name='" + name + '\'' +
                ", port=" + port +
                '}';
    }
}
