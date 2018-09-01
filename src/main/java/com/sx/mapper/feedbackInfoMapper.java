package com.sx.mapper;

import com.sx.pojo.feedbackInfo;

import java.util.List;

public interface feedbackInfoMapper {

    public int sendFeedback(feedbackInfo feedbackInfo);
    public List<feedbackInfo> sendFeedbackType();
    public feedbackInfo getone(int id);
    public int addlist(List<feedbackInfo> list);
    public List<feedbackInfo> getall(int ucid);
    public void addfeedbacktype(feedbackInfo feedbackInfo);
    public feedbackInfo getOneFeedbackInfo(feedbackInfo feedbackInfo);
    public feedbackInfo updateFeedbackInfo(feedbackInfo feedbackInfo);

}
