package com.sx.pojo;

public class Study implements Runnable{


    public String add(){
        return "hehe";
    }

    public static void main(String[] args) {
//        Peeler peeler=new Peeler();
//        peeler.eat();
//        System.out.println(peeler.var2);
//        Person person=new Person();
//



    }






    public void run() {
      String var1=add();
        System.out.println(var1);
    }
}
