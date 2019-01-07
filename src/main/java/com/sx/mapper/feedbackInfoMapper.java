package com.sx.mapper;

import com.sx.pojo.FeedbackInfo;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface feedbackInfoMapper {

    public void sendFeedback(FeedbackInfo FeedbackInfo);
    public List<FeedbackInfo> sendFeedbackType();
    public FeedbackInfo getone(int id);
    public int addlist(List<FeedbackInfo> list);
    public List<FeedbackInfo> getall();
    public void addfeedbacktype(FeedbackInfo FeedbackInfo);
    public FeedbackInfo getOneFeedbackInfo(FeedbackInfo FeedbackInfo);
    public Integer updateFeedbackInfo(@Param("list") List list);
    public List<FeedbackInfo> getFeedbackInfoList(@Param("list") List list);
    @MapKey("id")
    public Map<Integer,FeedbackInfo> getFeedbackInfoMap(@Param("ids") Set<Integer> ids);

}
