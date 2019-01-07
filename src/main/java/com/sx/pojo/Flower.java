package com.sx.pojo;

public class Flower {
    int petalCount=0;
    String s="initial value";
    Flower(int petals){
        petalCount=petals;
        System.out.println("petalCount="+petalCount);
    }
    Flower(String ss){
        System.out.println("Constructor String are only ,s ="+ss);
        s=ss;
    }
    Flower(String s,int petals){
        this(petals);
        this.s=s;
    }
    public void printpetalCount(){
//        this(11);
        System.out.println("petalCount ="+petalCount+"s"+s);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
