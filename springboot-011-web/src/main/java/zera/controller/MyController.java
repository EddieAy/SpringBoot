package zera.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.MalformedURLException;

@Controller
public class MyController {


    @GetMapping("/images/ice")
    public ResponseEntity<Resource> img() throws MalformedURLException {
        UrlResource imgFile = new UrlResource("classpath:/static/ICE.JPG");
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(imgFile);
    }

    @GetMapping("/test")
    @ResponseBody
    public String test(HttpServletRequest httpServletRequest){
        return httpServletRequest.getRequestURI() + "  请求";
    }


}
