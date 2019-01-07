package com.sx.pojo;

import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;

public class ElasticSearch {
    @Autowired
    private TransportClient client;
    //判断索引是否存在
    public boolean isIndexExist(String index){
        return client.admin().indices().prepareExists(index).execute().actionGet().isExists();
    }
}
