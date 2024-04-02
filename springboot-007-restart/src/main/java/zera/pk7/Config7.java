package zera.pk7;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zera.bean.SecurityBean;

@Configuration
public class Config7 {
    @ConfigurationProperties(prefix = "sec")
    @Bean
    public SecurityBean securityBean(){
        return new SecurityBean();
    }
}
