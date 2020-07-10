package com.Jevin.Impl;

import com.Jevin.Dao.StudentDao;
import com.Jevin.pojo.Student;
import com.Jevin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student selectone(String id) {
        return studentDao.selectone(id);
    }


    @Override
    public List<Student> selectAll() {
        return studentDao.selectAll();
    }
}
