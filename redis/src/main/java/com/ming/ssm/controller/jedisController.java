package com.ming.ssm.controller;


import com.ming.ssm.pojo.Student;
import com.ming.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class jedisController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("FormJedisOneStudent")
    @ResponseBody
    public Student FormJedisOneStudent(@RequestBody Student student)throws Exception{
        return studentService.selectone(student.getId());
    }

    @RequestMapping("FormJedisAllStudent")
    @ResponseBody
    public List<Student> FormJedisAllStudent()throws Exception{

        return studentService.selectAll();
    }

    @RequestMapping("/FormJedisOneStudent123")
    public String FormJedisOneStudent123(String id)throws Exception{
         System.out.println(studentService.selectone(id));
        return"index";
    }
}
