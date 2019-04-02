package com.qf.students.controller;

import com.qf.students.entity.TTea;
import com.qf.students.service.serviceImpl.TeaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeaController {
    @Autowired
    private TeaServiceImpl teaService;

    /**
     * 展示老师页面
     * @return
     */
    @RequestMapping("/toTeaList")
    public String toTeaList(ModelMap map){
        List<TTea> tTeaList=teaService.selectAllTeacher();
        map.put("tTeaList",tTeaList);
        return "teaList";
    }



    @RequestMapping("/addTea")
    public String addTea(){
       return "";
    }





}
