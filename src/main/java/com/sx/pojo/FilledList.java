package com.sx.pojo;

import org.elasticsearch.common.recycler.Recycler;

public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type){
        this.type=type;
    }
}
