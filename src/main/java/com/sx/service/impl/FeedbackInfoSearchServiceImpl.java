package com.sx.service.impl;

import com.sx.mapper.ArticleRepository;
import com.sx.pojo.FeedbackInfo;
import com.sx.service.FeedbackInfoSearchService;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FeedbackInfoSearchServiceImpl implements FeedbackInfoSearchService {
    @Autowired
    ArticleRepository articleRepository;
    public void save(FeedbackInfo article) {
        articleRepository.save(article);
    }

    public void delete(FeedbackInfo article) {
        articleRepository.delete(article);
    }

    public FeedbackInfo findOne(Integer id) {
        return null;
    }

    public Iterable<FeedbackInfo> findAll(String title) {
        MatchQueryBuilder queryBuilder = QueryBuilders.matchQuery("title", title);
        return articleRepository.search(queryBuilder);
    }

    public Page<FeedbackInfo> findAll(Pageable pageable) {
        return null;
    }

    public List<FeedbackInfo> findByTitle(String title) {
        MatchQueryBuilder queryBuilder = QueryBuilders.matchQuery("title", "刘春博");
        return null;
    }

    public Page<FeedbackInfo> findByTitle(String title, Pageable pageable) {
        return null;
    }

    public void saveAll(List<FeedbackInfo> feedbackInfos) {
        articleRepository.saveAll(feedbackInfos);
    }
}
