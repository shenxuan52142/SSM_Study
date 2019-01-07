package com.sx.pojo;

import java.util.Random;

public class Person {
    private   String var1="this is Person";
    public String var2="22222222222";
    public static Random random=new Random();
    public static final int TEST=random.nextInt();
    public final int test=random.nextInt();

    public  void eat(){

        System.out.println("public static final int TEST="+TEST);

    }
    public void drink(){

        System.out.println("public final int test="+test);
    }
   public Person(String var1){
        System.out.println("Person+"+var1);
    }
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){
        return input;
    }
   



}
