package com.Jevin.controol;


import com.Jevin.pojo.Student;
import com.Jevin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RedisContoller {

    @Autowired
    private StudentService studentService;

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;


    @RequestMapping("/TestRedis")
    @ResponseBody
    public Student TestRedis()throws Exception{
        Student student=null;
        student=(Student)redisTemplate.opsForValue().get("20174078");
        if(student!=null){
            return student;
        }
        student=studentService.selectone("20174078");
        redisTemplate.opsForValue().set("20174078",student);
        return student;
    }



    @RequestMapping("/TestRedis1")
    @ResponseBody
    public Student TestRedis1(@RequestBody Student student)throws Exception{
        Student student1=null;
        student1=(Student)redisTemplate.opsForValue().get(student.getId());
        if(student1!=null){
            return student1;
        }
        student1=studentService.selectone(student.getId());
        redisTemplate.opsForValue().set(student.getId(),student1);
        return student1;
    }

    @RequestMapping("/TestRedis3")
    @ResponseBody
    public List<Student> TestRedis3(){
        System.out.println("aaaaa");
        List<Object> list=null;
        List<Student> list2=null;
        list=redisTemplate.opsForList().range("list",0,-1);
        if(list!=null){
            for(Object j:list){
                Student aa=(Student)j;
                list2.add(aa);
            }
            return list2;
        }
        list2=studentService.selectAll();
        System.out.println(list2.toString());
        redisTemplate.opsForList().leftPushAll("list",list2);
        return list2;
    }


}
