package com.ten.demo.service.Impl;

import com.ten.demo.Dao.StudentDao;
import com.ten.demo.pojo.Student;
import com.ten.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@CacheConfig
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    @Cacheable(value = "thrFirset", key="'thrFirset'+#p0")
    public Student selectone(String id) {
        return studentDao.selectone(id);
    }

    @Override
    @Cacheable(value = "thrFirset",key = "'thrFirsetALL'")
    public List<Student> selectAll() {
        return studentDao.selectAll();
    }

    @Override
    @CachePut(value="thrFirset",key = "'thrFirset'+#p0.id")
    public int insertTo(Student student) {
        return studentDao.insertTo(student);
    }

    @Override
    @CachePut(value="thrFirset",key="'thrFirset'+#p0.id")
    public int updatefromone(Student student) {
        return studentDao.updatefromone(student);
    }

    @Override
    @CacheEvict(value="thrFirset",key = "'thrFirset'+#p0")
    public int deleteone(String id) {
        return studentDao.deleteone(id);
    }
}
