package zera.controller;


import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zera.pojo.StudentInfo;

@Controller
public class HelloSpringController {

    @Resource
    private StudentInfo info;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello you there";
    }


    @RequestMapping("/info")
    @ResponseBody
    public String info(){
        return "schoolinfo :" + info.toString();
    }
}
