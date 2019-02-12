package com.sx.pojo;

import java.util.Random;

public class Peeler extends Person {
private String aaaaaa="this is peeler";
public static Random random=new Random(47);
public  Peeler(String var1){
    super(var1);
    System.out.println("Peeler+"+var1);
}
public void eat(){

    System.out.println(aaaaaa);
}

 void wolk(){
    System.out.println("这是我独有的方法");
}

public void test1(){

}
static {
    System.out.println("this is static peeler");
}

}
