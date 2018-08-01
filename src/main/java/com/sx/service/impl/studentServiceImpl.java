package com.sx.service.impl;

import com.sx.mapper.studentMapper;
import com.sx.pojo.check;
import com.sx.pojo.student;
import com.sx.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceImpl implements studentService {
    @Autowired
    studentMapper studentMapper;
    @Autowired
    ThreadPoolTaskExecutor taskExecutor;

    public studentServiceImpl(){};

    public List<student> list() {
        return studentMapper.list();
    }

    public void add(student student) {
        studentMapper.add(student);
    }

    public void update(student c) {
        studentMapper.update(c);
    }

    public student get(int id) {
        return studentMapper.get(id);
    }

    public void delete(student c) {
        studentMapper.delete(c.getId());
    }

    public int count() {
        return studentMapper.count();
    }
    public int javacount(){
        return studentMapper.javacount();
    }
}
