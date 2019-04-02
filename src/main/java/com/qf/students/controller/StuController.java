package com.qf.students.controller;

import com.qf.students.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StuController {

    @Autowired
    private StuService stuService;


    @RequestMapping("/tostulist")
    public String stuList(ModelMap map){

        List stuList = stuService.getStuList();
        map.put("stuList", stuList);
        return "stu/stulist";
    }
}
