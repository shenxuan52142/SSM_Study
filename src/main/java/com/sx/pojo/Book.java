package com.sx.pojo;

public class Book {
    boolean checkedOut=false;
   public void open(){
       System.out.println("哈哈哈哈");
   }
  public   Book(boolean checkOut){
        checkedOut=checkOut;
    }
    public  void checkIn(){
        checkedOut=false;
    }
    protected void finalize()throws Throwable {
        if (checkedOut){
            System.out.println("Error : checked out");


        }
        super.finalize();
    }
}
