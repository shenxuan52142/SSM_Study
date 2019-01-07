package com.sx.service;

import com.sx.pojo.FeedbackInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FeedbackInfoSearchService {
    public void save(FeedbackInfo article);
    public void saveAll(List<FeedbackInfo> feedbackInfos);

    public void delete(FeedbackInfo article);

    public FeedbackInfo findOne(Integer id);

    public Iterable<FeedbackInfo> findAll(String title);

    public Page<FeedbackInfo> findAll(Pageable pageable);

    public List<FeedbackInfo> findByTitle(String title);

    public Page<FeedbackInfo> findByTitle(String title, Pageable pageable);

}
