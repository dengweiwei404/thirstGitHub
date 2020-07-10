package com.ming.ssm.service.impl;

import com.ming.ssm.mapper.StudentDao;
import com.ming.ssm.pojo.Student;
import com.ming.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentDao studentDao;

    @Override
    @Cacheable(value="cacheManager", key="'Student'+#id")
    public Student selectone(String id) throws Exception {
        return studentDao.selectone(id);
    }

    @Override
    @Cacheable(value="cacheManager", key="'StudentAll'")
    public List<Student> selectAll() throws Exception {
        return studentDao.selectAll();
    }
}
