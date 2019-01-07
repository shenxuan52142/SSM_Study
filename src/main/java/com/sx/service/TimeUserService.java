package com.sx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("timeUserService")
public class TimeUserService {
    @Autowired
    feedbackSce feedbackSce;

    public  void time(){
        feedbackSce.Timetest();
    }
}
