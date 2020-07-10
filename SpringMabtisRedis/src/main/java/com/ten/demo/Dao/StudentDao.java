package com.ten.demo.Dao;

import com.ten.demo.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentDao {

    public Student selectone(String id);

    public List<Student> selectAll();

    public int insertTo(Student student);

    public int updatefromone(Student student);

    public int deleteone(String id);
}
