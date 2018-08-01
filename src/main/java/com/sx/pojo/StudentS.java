package com.sx.pojo;

public class StudentS {
    private Integer id;
    private Integer age;
    private String name;
    public StudentS (){};

    public StudentS(int id,int age,String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [id="+id+",name="+name+",age="+age+"]";
    }
}
