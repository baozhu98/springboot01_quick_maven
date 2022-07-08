package com.baozhu.comtroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Controller01 {

    @RequestMapping("/quick01")
    @ResponseBody
    public String quick(){
        return "由好 , springboot";
    }
}
