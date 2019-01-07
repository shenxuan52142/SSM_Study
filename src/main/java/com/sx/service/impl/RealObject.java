package com.sx.service.impl;

import com.sx.service.StudyInterface;

public class RealObject implements StudyInterface{
    public void doSomething() {
        System.out.println("第一个");
    }

    public void somethingElse(String arg) {
        System.out.println("第一个"+arg);
    }
}
