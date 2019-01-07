package com.sx.service;

import com.sx.pojo.FeedbackInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface feedbackSce {
    public void sendfeedback(FeedbackInfo FeedbackInfo);
//    public void sendFeedbackTyp(FeedbackInfo FeedbackInfo);
    public FeedbackInfo getone(int id);
    public void addlist(List<FeedbackInfo> FeedbackInfos);
    public List<FeedbackInfo> getall();
    public void addfeedbacktype(FeedbackInfo FeedbackInfo);
    public FeedbackInfo getOneFeedbackInfo(FeedbackInfo FeedbackInfo);
    public List<FeedbackInfo> getFeedbackInfoList( List list);
    public Map<Integer,FeedbackInfo> getFeedbackInfoMap(Set<Integer> set);
    public void Timetest();
    public Integer updateFeedbackInfo(List list);
}
