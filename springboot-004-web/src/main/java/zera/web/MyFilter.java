package zera.web;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行了过滤器方法 filter");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
