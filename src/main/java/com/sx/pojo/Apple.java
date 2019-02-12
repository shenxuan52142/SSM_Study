package com.sx.pojo;

import java.util.Random;

public class Apple extends Person{
    public static Random random=new Random(47);
    public  void eat(){

        System.out.println("this is Apple");

    }
    public static final String appleStr="i am an apple";
}
