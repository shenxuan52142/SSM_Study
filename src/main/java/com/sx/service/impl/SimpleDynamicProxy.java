package com.sx.service.impl;

import com.sx.service.StudyInterface;

import java.lang.reflect.Proxy;

public class SimpleDynamicProxy {
    public static void consumer(StudyInterface studyInterface){
           studyInterface.doSomething();
           studyInterface.somethingElse("bonbon");
    }

    public static void main(String [] args){
        RealObject real=new RealObject();
        consumer(real);

        StudyInterface proxy=(StudyInterface) Proxy.newProxyInstance(StudyInterface.class.getClassLoader(),new Class[]{StudyInterface.class},new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
