package com.sx.service;

import com.sx.pojo.student;

import java.util.List;

public interface studentService {
    List<student> list();
    void add(student c);
    void update(student c);
    void delete(student c);
    student get(int id);
    int count();
    int javacount();
}
