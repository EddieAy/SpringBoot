package zera.config;

import jakarta.servlet.Filter;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletRegistration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import zera.web.MyServlet;

@Configuration
public class WebServletConfig {

    @Bean
    public ServletRegistrationBean<Servlet> servletRegistration() {
        ServletRegistrationBean<Servlet> bean = new ServletRegistrationBean<>(new MyServlet(), "/myServlet");
        return bean;
    }

//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
//        CharacterEncodingFilter filter = new CharacterEncodingFilter();
//        filter.setEncoding("utf-8");
//        filter.setForceEncoding(true);
//        filterFilterRegistrationBean.setFilter(filter);
//        filterFilterRegistrationBean.addUrlPatterns("/*");
//        return filterFilterRegistrationBean;
//    }



}
