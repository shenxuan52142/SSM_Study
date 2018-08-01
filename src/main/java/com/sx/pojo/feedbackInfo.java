package com.sx.pojo;

import java.util.Date;
import java.util.List;

public class feedbackInfo {
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    private int id;
    private String url;
    private String comm;
    private String type1;
    private String type2;
    private Date time;
    private List<String> name;

    public int getUcid() {
        return ucid;
    }

    public void setUcid(int ucid) {
        this.ucid = ucid;
    }

    private int ucid;

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getType3() {
        return type3;
    }

    public void setType3(String type3) {
        this.type3 = type3;
    }

    public String getType4() {
        return type4;
    }

    public void setType4(String type4) {
        this.type4 = type4;
    }

    private String type3;
    private String type4;

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    private List<String> type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    @Override
    public String toString() {
        return "feedbackInfo{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", comm='" + comm + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", type3='" + type3 + '\'' +
                ", type4='" + type4 + '\'' +
                ", type=" + type +
                '}';
    }
    public void sout(){
        System.out.println("______________________");
    }
}
