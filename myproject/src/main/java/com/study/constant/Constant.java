package com.study.constant;

/**
 * @Author peterche
 * @Description
 * @Date 2023/2/24 22:58
 **/
public class Constant {

    /**
     * redisson延迟队列key前缀
     */
    public static final String QUEUE_CODE = "redis_delay_queue:%s";

    /**
     * poi挂接查询对应的kafka topic
     */
    public static final String POI_QUERY_TOPIC = "poi_query";
}
