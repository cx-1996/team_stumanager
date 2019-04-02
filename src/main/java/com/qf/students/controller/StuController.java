package com.qf.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stu")
public class StuController {


    @RequestMapping("/stulist")
    public String stuList(){
        return "";
    }
}
