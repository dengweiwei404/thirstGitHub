package com.ming.ssm.service;

import com.ming.ssm.pojo.Student;

import java.util.List;

public interface StudentService {

    public Student selectone(String id)throws Exception;

    public List<Student> selectAll()throws Exception;
}
