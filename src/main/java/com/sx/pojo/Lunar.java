package com.sx.pojo;

public class Lunar {
    public boolean isleap;
    public int lunarDay;
    public int lunarMonth;
    public int lunarYear;
    public Lunar(int lunarYear,int lunarMonth,int lunarDay,boolean isleap){
        this.lunarYear=lunarYear;
        this.lunarMonth=lunarMonth;
        this.lunarDay=lunarDay;
        this.isleap=isleap;
    }
    public Lunar(){

    }
}
