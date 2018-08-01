package com.sx.mapper;

import com.sx.pojo.student;

import java.util.List;

public interface studentMapper {
    void add(student student);

    void delete(int var1);

    student get(int var1);

    int update(student var1);

    List<student> list();

    int count();

    int javacount();
}
