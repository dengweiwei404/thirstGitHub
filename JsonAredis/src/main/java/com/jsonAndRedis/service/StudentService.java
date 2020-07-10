package com.jsonAndRedis.service;

import com.jsonAndRedis.pojo.Student;


import java.util.List;

public interface StudentService {

    public Student selectone(String id);

    public List<Student> selectAll();
}
