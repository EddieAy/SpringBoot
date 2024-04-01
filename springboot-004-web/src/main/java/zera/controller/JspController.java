package zera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JspController {

    @RequestMapping("/jsp")
    public String jsp(Model model){
        model.addAttribute("data","爆仓了");
        return "index";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "I wanna know";
    }

    @RequestMapping("/user/hello")
    @ResponseBody
    public String userHello(){
        return "userHello";
    }

    @RequestMapping("/user/login")
    @ResponseBody
    public String userLogin(){
        return "userLogin";
    }

    @RequestMapping("/user/account")
    @ResponseBody
    public String userFilter(){
        return "user/account";
    }
}
