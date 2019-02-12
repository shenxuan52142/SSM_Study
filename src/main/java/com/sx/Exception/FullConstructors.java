package com.sx.Exception;

public class FullConstructors {
    public static void f()throws MyException{
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }
    public static void g()throws MyException{
        System.out.println("Throwing MyException from g()");
        throw new MyException("originated in g()");
    }

}
