package com.sx.service.impl;

import com.sx.service.StudyInterface;

public class SimpleProxy implements StudyInterface{
    private StudyInterface proxied;
    public SimpleProxy(StudyInterface proxied){
        this.proxied=proxied;
    }


    public void doSomething() {
        System.out.println("第二个");
        proxied.doSomething();
    }

    public void somethingElse(String arg) {
        System.out.println("第二个"+arg);
        proxied.somethingElse(arg);
    }
}
