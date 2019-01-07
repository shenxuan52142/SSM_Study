package com.sx.service.impl;

import com.sx.mapper.feedbackInfoMapper;
import com.sx.pojo.FeedbackInfo;
import com.sx.service.feedbackSce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class feedbackImpl implements feedbackSce {
  @Autowired
    feedbackInfoMapper feedbackInfoMapper;

    public void sendfeedback(FeedbackInfo FeedbackInfo)  {
     feedbackInfoMapper.sendFeedback(FeedbackInfo);
    }

    public FeedbackInfo getone(int id) {
        return feedbackInfoMapper.getone(id);
    }

    public void addlist(List<FeedbackInfo> FeedbackInfos) {
        feedbackInfoMapper.addlist(FeedbackInfos);
    }

    public List<FeedbackInfo> getall() {
        return feedbackInfoMapper.getall();
    }
//    public void sendFeedbackTyp(FeedbackInfo FeedbackInfo) {
//        feedbackInfoMapper.sendFeedbackType(FeedbackInfo);
//    }


    public void addfeedbacktype(FeedbackInfo FeedbackInfo) {

         feedbackInfoMapper.addfeedbacktype(FeedbackInfo);
    }

    public FeedbackInfo getOneFeedbackInfo(FeedbackInfo FeedbackInfo) {
        return feedbackInfoMapper.getOneFeedbackInfo(FeedbackInfo);
    }

    public List<FeedbackInfo> getFeedbackInfoList(List list) {
        return feedbackInfoMapper.getFeedbackInfoList(list);
    }

    public Map<Integer, FeedbackInfo> getFeedbackInfoMap(Set<Integer> set)  {
        return feedbackInfoMapper.getFeedbackInfoMap(set);
    }

    public void Timetest() {
        System.out.println("定时任务测试");
    }

    public Integer updateFeedbackInfo(List list) {
        return feedbackInfoMapper.updateFeedbackInfo(list);
    }
}
