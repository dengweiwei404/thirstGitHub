package com.jsonAndRedis.controller;


import com.jsonAndRedis.pojo.Student;
import com.jsonAndRedis.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JsonAndRedisCon {


    @Autowired
    private StudentService studentService;

    @RequestMapping("/selectAllForm")
    @ResponseBody
    public List<Student> selectAllForm(){
        List<Student> list=studentService.selectAll();
        if(list==null){
            return null;
        }
        return list;
    }

    @RequestMapping("toJson")
    public String toJson(){
        return "Json";
    }

    @RequestMapping("/toJsonRedis")
    @ResponseBody
    public Student toJsonRedis(@RequestBody Student student1){
        Student student=studentService.selectone(student1.getId());
        if(student==null){
            return null;
        }
        return student;
    }

    @RequestMapping("toJson1")
    public String toJson1(){
        return "JsonSelectById";
    }

    @RequestMapping("/toJsonRedis1")
    @ResponseBody
    public Student toJsonRedis1(@RequestParam(defaultValue = "20174078") String id){
        Student student=studentService.selectone(id);
        if(student==null){
            return null;
        }
        return student;
    }

    @RequestMapping("Totablecut")
    public String Totablecut(){

        return "tabcut";
    }

    @RequestMapping("SecondTabcut")
    public String SecondTabcut(){

        return "SecondTabcutasd";
    }
}
