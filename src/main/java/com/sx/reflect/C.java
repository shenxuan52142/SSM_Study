package com.sx.reflect;

 class C implements A{
     public void f() {
         System.out.println("C.f()");
     }
     public void g(){
         System.out.println("C.g()");
     }
     void u(){
         System.out.println("package C.u()");
     }
     protected void v(){
         System.out.println("protected C.v()");
     }
     private void w(){
         System.out.println("private C.w()");
     }
 }
