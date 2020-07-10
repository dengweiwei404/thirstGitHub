package com.Jevin.service;

import com.Jevin.pojo.Student;

import java.util.List;

public interface StudentService {

    public Student selectone(String id);

    public List<Student> selectAll();
}
