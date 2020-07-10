package com.jsonAndRedis.mapper;

import com.jsonAndRedis.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentDao {

    public Student selectone(@Param("id")String id);

    public List<Student> selectAll();
}
