package com.ten.demo.service;

import com.ten.demo.pojo.Student;

import java.util.List;

public interface StudentService {

    public Student selectone(String id);

    public List<Student> selectAll();

    public int insertTo(Student student);

    public int updatefromone(Student student);

    public int deleteone(String id);
}
