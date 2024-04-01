package zera.config;

import jakarta.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zera.web.MyFilter;

@Configuration
public class WebFilterConfig {

    @Bean
    public FilterRegistrationBean<Filter> filterFilterRegistrationBean(){
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new MyFilter());
        filterFilterRegistrationBean.addUrlPatterns("/user/*");
        return filterFilterRegistrationBean;
    }
}
