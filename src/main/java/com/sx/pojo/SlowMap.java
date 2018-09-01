package com.sx.pojo;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SlowMap<K,V> extends HashMap<K,V>{
    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
