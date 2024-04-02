package zera.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class LogAspect {
    @Before("execution(* zera.service..*.*(..))")
    public void log(JoinPoint joinPoint){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = simpleDateFormat.format(new Date());
        String methodName = joinPoint.getSignature().getName();
        System.out.println(time +"  "+methodName+" 被执行了");

    }
}
