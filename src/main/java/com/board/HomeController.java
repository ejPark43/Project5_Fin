package com.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "login";
    }

//    @RequestMapping("/list")
//    public String friendlist(){
//
//        return "posts"; // board/list?
//    }

}