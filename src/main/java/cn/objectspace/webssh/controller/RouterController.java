package cn.objectspace.webssh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouterController {
    @RequestMapping("/ssh")
    public String websshpage(){
        return "webssh";
    }

//    @RequestMapping("/ssh1")
//    public void websshpage1(){
//        System.err.println("bskdhfdshbvjds");
//    }
}
