package com.jsonAndRedis.service.impl;

import com.jsonAndRedis.mapper.StudentDao;
import com.jsonAndRedis.pojo.Student;
import com.jsonAndRedis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentDao studentDao;


    @Override
    @Cacheable(value="cacheManager", key="'selectone'+#id")//redis缓存注解,使用这个value代表缓存的名字，key代表缓存的key
    public Student selectone(String id) {                 //这个注解相当于在java代码中先判断缓存中有没有这个key有直接给出，就不用取数据查找了，
        return studentDao.selectone(id);                  //如果没有则在数据库中查找将找到的结果存入缓存中。
    }

    @Override
    @Cacheable(value="cacheManager", key="'selectAll'")
    public List<Student> selectAll() {
        return studentDao.selectAll();
    }
}
