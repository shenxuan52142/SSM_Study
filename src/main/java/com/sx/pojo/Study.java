package com.sx.pojo;

public class Study implements Runnable{


    public String add(){
        return "hehe";
    }








    public void run() {
      String var1=add();
        System.out.println(var1);
    }
}
