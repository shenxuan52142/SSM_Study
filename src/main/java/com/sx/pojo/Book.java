package com.sx.pojo;

import java.util.Calendar;
import java.util.Date;

public class Book  {
//        public static final int staticFinalInt=Apple.random.nextInt(1000);
        static {
            System.out.println("i am book");
        }

        public   void speak(){
            System.out.println("sss");
        }
        public Book(String var1){
            System.out.println("ssss+++"+var1);
        }


        public String toString(){
            return "Booksssssss";
        }
        public static void hehe(String var1){
            var1="sssss";
            System.out.println(var1);
        }

    public static void main(String[] args) {
        Date date=new Date();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);

        Calendar calendar1=Calendar.getInstance();



        System.out.println(calendar.after(calendar1));

    }


}
