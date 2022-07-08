package com.baozhu.comtroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller02yml {

    //普通数据测试
    /*@Value("${name}")
    private  String name;

    @Value("${age}")
    private  String age;

    @RequestMapping("/quick02")
    @ResponseBody
    public String quick1(){
        return "name"+name+"age"+age;
    }*/


    //对象数据测试
    /*@Value("${person2.name}")
    private  String name;
    @Value("${person2.age}")
    private  String age;
    @Value("${person2.addr}")
    private  String addr;

    @RequestMapping("/quick02")
    @ResponseBody
    public String quick2(){
        return "name:"+name+" age:"+age+" addr:"+addr;
    }*/


    //集合数据测试
    /*@Value("${student[0].name}")
    private  String student;
    @RequestMapping("/quick02")
    @ResponseBody
    public String quick2(){
        return "student:"+student;
    }*/

}
