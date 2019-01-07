package com.sx.pojo;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
//import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;
@Document(createIndex = false,indexName = "ceshi3",type = "FeedbackInfo1")
public class FeedbackInfo {

    public String  getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    @Field(index = false,store = true,type = FieldType.Integer)
    private int id;
    @Field(index = true,analyzer = "ik_smart",store = true,searchAnalyzer ="ik_smart",type = FieldType.Text)
    private String url;
    @Field(index = true,analyzer = "ik_smart",store = true,searchAnalyzer ="ik_max_word",type = FieldType.Text)
    private String comm;
    @Field(index = true,analyzer = "ik_max_word",store = true,searchAnalyzer ="ik_smart",type = FieldType.Text)
    private String type1;
    @Field(index = true,analyzer = "ik_max_word",store = true,searchAnalyzer ="ik_max_word",type = FieldType.Text)
    private String type2;
    @Field(index = true,analyzer = "ik_max_word",store = true,searchAnalyzer ="ik_max_word",type = FieldType.Text)
    private String time;
    @Field(index = true,analyzer = "ik_max_word",store = true,searchAnalyzer ="ik_max_word",type = FieldType.Text)
    private String ucId;
    @Field(index = true,analyzer = "ik_max_word",store = true,searchAnalyzer ="ik_max_word",type = FieldType.Text)
    private String type3;
    @Field(index = true,analyzer = "ik_max_word",store = true,searchAnalyzer ="ik_max_word",type = FieldType.Text)
    private String type4;
    @Field(index = false,type = FieldType.Integer)
    private int ucid;
    @Field(index = true,analyzer = "ik_max_word",store = true,searchAnalyzer ="ik_max_word",type = FieldType.Text,pattern="" )
    private String update_time;


    public int getUcid() {
        return ucid;
    }

    public void setUcid(int ucid) {
        this.ucid = ucid;
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

    public String getUcId() {
        return ucId;
    }

    public void setUcId(String var1) {
        ucId = var1;
    }


    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "FeedbackInfo{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", comm='" + comm + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", type3='" + type3 + '\'' +
                ", type4='" + type4 + '\'' ;
    }
    public void sout(){
        System.out.println("______________________");
    }

    @Override
    public  int hashCode(){
        return ucId.hashCode()*37+id;
    }
    @Override
    public boolean equals(Object obj){
        //判断obj是否为feedbackInfo
        return obj instanceof FeedbackInfo
                && this.ucId.equals(((FeedbackInfo)obj).ucId) && this.id==((FeedbackInfo)obj).id;

    }
}
