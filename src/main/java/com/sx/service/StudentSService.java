package com.sx.service;

import com.sx.pojo.StudentS;

import java.util.List;

public interface StudentSService {
    List<StudentS> list();
    void add(StudentS c);
    void update(StudentS c);
    void delete(StudentS c);
    StudentS get(int id);
}
