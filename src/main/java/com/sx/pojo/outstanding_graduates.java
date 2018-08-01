package com.sx.pojo;

public class outstanding_graduates {
    private int id;
    private String name;
    private String occupation;
    private String description;
    private String picture;

    public outstanding_graduates(){};

    public outstanding_graduates(int id,String name,String occupation,String description,String picture){
        this.id=id;
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
        return super.toString();
    }
}
