package com.ming.ssm.mapper;

import com.ming.ssm.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {


    public Student selectone(@Param("id") String id)throws Exception;

    public List<Student> selectAll()throws Exception;
}
