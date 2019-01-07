package com.sx.mapper;

import com.sx.pojo.FeedbackInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ArticleRepository extends ElasticsearchRepository<FeedbackInfo,Integer> {

}
