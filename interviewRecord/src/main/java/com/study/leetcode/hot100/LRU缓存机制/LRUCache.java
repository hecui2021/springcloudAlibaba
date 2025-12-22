package com.study.leetcode.hot100.LRU缓存机制;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/10/28 11:15
 */
public class LRUCache extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
