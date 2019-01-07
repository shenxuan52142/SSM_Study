package com.sx.pojo;

public class Peeler extends Person {
private String aaaaaa="this is peeler";
public  Peeler(String var1){
    super(var1);
    System.out.println("Peeler+"+var1);
}
public void eat2(){
    super.eat();
    System.out.println(aaaaaa);
}


}
