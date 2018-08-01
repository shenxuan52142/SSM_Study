package com.sx.service.impl;

import com.sx.mapper.feedbackInfoMapper;
import com.sx.pojo.feedbackInfo;
import com.sx.service.feedbackSce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class feedbackImpl implements feedbackSce {
  @Autowired
    feedbackInfoMapper feedbackInfoMapper;

    public void sendfeedback(feedbackInfo feedbackInfo)  {
     feedbackInfoMapper.sendFeedback(feedbackInfo);
    }

    public List<String> getone(int id) {
        return feedbackInfoMapper.getone(id);
    }

    public void addlist(List<feedbackInfo> feedbackInfos) {
        feedbackInfoMapper.addlist(feedbackInfos);
    }

    public List<feedbackInfo> getall(int ucid) {
        return feedbackInfoMapper.getall(ucid);
    }
//    public void sendFeedbackTyp(feedbackInfo feedbackInfo) {
//        feedbackInfoMapper.sendFeedbackType(feedbackInfo);
//    }


    public void addfeedbacktype(feedbackInfo feedbackInfo) {
         feedbackInfoMapper.addfeedbacktype(feedbackInfo);
    }
}
