package com.sx.mapper;

import com.sx.pojo.StudentS;

import java.util.List;

public interface StudentSMapper {
    int add(StudentS var1);

    void delete(int var1);

    StudentS get(int var1);

    int update(StudentS var1);

    List<StudentS> list();

    int count();
}
