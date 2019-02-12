package com.sx.pojo;

public class Book  {
        public static final int staticFinalInt=Apple.random.nextInt(1000);
        static {
            System.out.println("i am book");
        }

        public  void speak(){
            System.out.println(this+"sss");
        }
//        public String toString(){
//            return "Booksssssss";
//        }

}
