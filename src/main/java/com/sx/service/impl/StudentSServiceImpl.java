package com.sx.service.impl;

import com.sx.mapper.StudentSMapper;
import com.sx.pojo.StudentS;
import com.sx.service.StudentSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentSServiceImpl implements StudentSService {
    @Autowired
    StudentSMapper studentSMapper;
    public StudentSServiceImpl(){}

    public List<StudentS> list() {
        return studentSMapper.list();
    }

    public void add(StudentS c) {
        studentSMapper.add(c);
    }

    public void delete(StudentS c) {
        studentSMapper.delete(c.getId());
    }

    public void update(StudentS c) {
        studentSMapper.update(c);
    }

    public StudentS get(int id) {
        return studentSMapper.get(id);
    }
}
