package com.sx.pojo;

public class student {
    private int id;
    private String name;
    private String occupation;
    private String description;
    private String picture;

    public student(){};

    public student(String name,String occupation,String description,String picture){

        this.name=name;
        this.occupation=occupation;
        this.description=description;
        this.picture=picture;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    @Override
    public String toString() {
        return "id："+id+"，姓名："+name+"，职业："+occupation+"，描述："+description+"，图片："+picture;
    }
}

