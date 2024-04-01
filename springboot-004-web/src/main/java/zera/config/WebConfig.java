package zera.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import zera.web.LoginIntercepor;


@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] lockPath = {"/user/**"};
        String[] passPath = {"/user/login"};
        registry.addInterceptor(new LoginIntercepor())
                .addPathPatterns(lockPath)
                .excludePathPatterns(passPath);
    }
}
