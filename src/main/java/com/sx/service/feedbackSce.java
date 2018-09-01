package com.sx.service;

import com.sx.pojo.feedbackInfo;

import java.util.List;

public interface feedbackSce {
    public void sendfeedback(feedbackInfo feedbackInfo);
//    public void sendFeedbackTyp(feedbackInfo feedbackInfo);
    public feedbackInfo getone(int id);
    public void addlist(List<feedbackInfo> feedbackInfos);
    public List<feedbackInfo> getall(int ucid);
    public void addfeedbacktype(feedbackInfo feedbackInfo);
    public feedbackInfo getOneFeedbackInfo(feedbackInfo feedbackInfo);
}
