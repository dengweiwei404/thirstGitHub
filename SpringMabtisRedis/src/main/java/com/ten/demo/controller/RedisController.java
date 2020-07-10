package com.ten.demo.controller;


import com.ten.demo.pojo.Student;
import com.ten.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RedisController {


    @Autowired
    private StudentService studentService;



    @RequestMapping("Fromselectone")
    public Student Fromselectone(){
        return studentService.selectone("20174080");
    }


    @RequestMapping("FromSelectAll")
    public List<Student> FromSelectAll(){
        return studentService.selectAll();
    }

    @RequestMapping("FromInsert")
    public int FromInsert(){
        Student s=new Student("20174085","孙辉","男",18);
        return studentService.insertTo(s);
    }

    @RequestMapping("Fromupdate")
    public int Fromupdate(){
        Student s=new Student("20174078","邓伟伟","女",24);
        return studentService.updatefromone(s);
    }

    @RequestMapping("FromDelete")
    public int FromDelete(){
        return studentService.deleteone("20174080");
    }
}


