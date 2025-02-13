package com.study.es.service;

import com.alibaba.fastjson.JSONObject;
import com.study.es.model.AccountBasicinfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.ClearScrollRequest;
import org.elasticsearch.action.search.ClearScrollResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchScrollRequest;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.rest.RestStatus;
import org.elasticsearch.search.Scroll;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.FetchSourceContext;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.springframework.util.CollectionUtils;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2023/9/24 14:08
 */
@Service
@Slf4j
public class EsService {
    @Autowired
    private RestHighLevelClient client;

    /**
     * 判断索引是否存在
     *
     * @param index
     * @return
     * @throws IOException
     */
    public boolean existsIndex(String index) throws IOException {
        GetIndexRequest request = new GetIndexRequest(index);
        boolean exists = client.indices().exists(request, RequestOptions.DEFAULT);
        return exists;
    }
    /**
     * 创建索引
     *
     * @param index
     * @throws IOException
     */
    public boolean createIndex(String index) throws IOException {
        CreateIndexRequest request = new CreateIndexRequest(index);
        CreateIndexResponse createIndexResponse = client.indices()
                .create(request, RequestOptions.DEFAULT);
        return createIndexResponse.isAcknowledged();
    }
    /**
     * 删除索引
     *
     * @param index
     * @return
     * @throws IOException
     */
    public boolean deleteIndex(String index) throws IOException {
        DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest(index);
        AcknowledgedResponse response = client.indices()
                .delete(deleteIndexRequest, RequestOptions.DEFAULT);
        return response.isAcknowledged();
    }
    /**
     * 判断某索引下文档id是否存在
     *
     * @param index
     * @param id
     * @return
     * @throws IOException
     */
    public boolean docExists(String index, String id) throws IOException {
        GetRequest getRequest = new GetRequest(index, id);
        //只判断索引是否存在不需要获取_source
        getRequest.fetchSourceContext(new FetchSourceContext(false));
        getRequest.storedFields("_none_");
        boolean exists = client.exists(getRequest, RequestOptions.DEFAULT);
        return exists;
    }
    /**
     * 添加文档记录
     *
     * @param index
     * @param id
     * @param obj 要添加的数据实体类
     * @return
     * @throws IOException
     */
    public boolean addDoc(String index, String id, Object obj) throws IOException {
        IndexRequest request = new IndexRequest(index);
//        request.id(id);
//        //timeout
//        request.timeout(TimeValue.timeValueSeconds(1));
//        request.timeout("1s");
        request.source(JSONObject.toJSONString(obj), XContentType.JSON);
        IndexResponse indexResponse = client.index(request, RequestOptions.DEFAULT);
        log.info("rsp:{}",JSONObject.toJSONString(indexResponse));
        RestStatus Status = indexResponse.status();
        return Status == RestStatus.OK || Status == RestStatus.CREATED;
    }
    /**
     * 根据id来获取记录
     *
     * @param index
     * @param id
     * @return
     * @throws IOException
     */
    public GetResponse getDoc(String index, String id) throws IOException {
        GetRequest request = new GetRequest(index, id);
        GetResponse getResponse = client.get(request,RequestOptions.DEFAULT);
        return getResponse;
    }
    /**
     * 批量添加文档记录
     * 没有设置id ES会自动生成一个，如果要设置 IndexRequest的对象.id()即可
     *
     * @param index
     * @param list
     * @return
     * @throws IOException
     */
    public boolean bulkAdd(String index, List<AccountBasicinfo> list) throws IOException {
        BulkRequest bulkRequest = new BulkRequest();
        //timeout
//        bulkRequest.timeout(TimeValue.timeValueMinutes(2));
//        bulkRequest.timeout("2m");
        for (int i = 0; i < list.size(); i++) {
            bulkRequest.add(new IndexRequest(index).source(JSONObject.toJSONString(list.get(i)),XContentType.JSON));
        }
        BulkResponse bulkResponse = client.bulk(bulkRequest,RequestOptions.DEFAULT);
//        log.info("hasFailures:{}",JSONObject.toJSONString(bulkResponse.hasFailures()));
        return !bulkResponse.hasFailures();
    }
    /**
     * 更新文档记录
     * @param index
     * @param id
     * @param obj
     * @return
     * @throws IOException
     */
    public boolean updateDoc(String index, String id, Object obj) throws IOException {
        UpdateRequest request = new UpdateRequest(index, id);
        request.doc(JSONObject.toJSONString(obj));
        request.timeout(TimeValue.timeValueSeconds(1));
        request.timeout("1s");
        UpdateResponse updateResponse = client.update(request, RequestOptions.DEFAULT);
        return updateResponse.status() == RestStatus.OK;
    }
    /**
     * 删除文档记录
     *
     * @param index
     * @param id
     * @return
     * @throws IOException
     */
    public boolean deleteDoc(String index, String id) throws IOException {
        DeleteRequest request = new DeleteRequest(index, id);
        //timeout
        request.timeout(TimeValue.timeValueSeconds(1));
        request.timeout("1s");
        DeleteResponse deleteResponse = client.delete(request, RequestOptions.DEFAULT);
        return deleteResponse.status() == RestStatus.OK;
    }
    /**
     * 根据某字段来搜索
     *
     * @param index
     * @param field
     * @param key 要收搜的关键字
     * @throws IOException
     */
    public SearchResponse search(String index, String field, String key, Integer
            from, Integer size) {
        SearchRequest searchRequest = new SearchRequest(index);
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        // 设置精确返回总数量
        sourceBuilder.trackTotalHits(true);
        sourceBuilder.query(QueryBuilders.termQuery(field, key));
        //控制搜素
        sourceBuilder.from(from);
        sourceBuilder.size(size);
        //最大搜索时间。
        sourceBuilder.timeout(new TimeValue(60, TimeUnit.SECONDS));
        searchRequest.source(sourceBuilder);
        SearchResponse searchResponse = null;
        try {
            searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            log.error("search error",e);
        }
        return searchResponse;
    }

    public SearchResponse searchAfter(String indexName,String field, String key,Integer size,Object[] values){
        //查询源构建器
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.size(size);
        searchSourceBuilder.from(0); //searchAfter需要将from设置为0或-1，当然也可以不写
        // 设置精确返回总数量
        searchSourceBuilder.trackTotalHits(true);
        //查询条件
        searchSourceBuilder.query(QueryBuilders.termQuery(field, key));
        //筛选字段，第一个参数为需要的字段，第二个参数为不需要的字段
        searchSourceBuilder.fetchSource(new String[] {"deviceid", "regist_time", "device_auth_state*"}, new String[] {});
        //以时间戳排序
        searchSourceBuilder.sort("regist_time", SortOrder.ASC);

        if (values != null)
            searchSourceBuilder.searchAfter(values);

        SearchRequest request = new SearchRequest(indexName);
        request.source(searchSourceBuilder);
        SearchResponse response = null;
        try {
            response = client.search(request, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        if (RestStatus.OK.equals(response.status())) {
//            //设置查询总量
//            SearchHit[] hits = response.getHits().getHits();
//            for(int i = 0; i < hits.length; i++) {
//                String index = hits[i].getIndex();
//                String id = hits[i].getId();
//                JSONObject jsonObject = JSONObject.parseObject(hits[i].getSourceAsString(), JSONObject.class);
//                System.out.println(jsonObject);
//                if (i == hits.length-1) {
//                    //最后一条数据的sortValue作为下一次查询的游标值
//                    values = hits[i].getSortValues();
//                    System.out.println(Arrays.toString(values));
//                }
//            }
//        }
        return response;
    }

    public List<AccountBasicinfo> redoAccountTypeByScroll(String indexName,String field, String key) {
        List<AccountBasicinfo> basicinfoList = new ArrayList<>();

        //构造es查询条件。
        SearchRequest searchRequest = new SearchRequest(indexName);
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();

        sourceBuilder.query(QueryBuilders.termsQuery(field, key))
            //设置最多一次能够取出10000条数据，从第10001条数据开始，将开启滚动查询。
            .size(10000)
            .fetchSource(new String[]{"f_channel","deviceid", "regist_time", "device_auth_state*"},null);
        searchRequest.source(sourceBuilder);
        //设置scroll超时时间(10min)。
        Scroll scroll=new Scroll(TimeValue.timeValueMinutes(10L));
        //放入滚动查询对象。
        searchRequest.scroll(scroll);
        SearchResponse response = null;
        try {
            response = client.search(searchRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //TODO：这里可以解析response对象，获取前10000条数据，封装实体类对象（属性为uid和type），并构成集合accountTypeVOList。我这里假设已经解析response对象完成，得到了accountTypeVOList集合。
        SearchHit[] hits = response.getHits().getHits();
        for(SearchHit hit : hits){
            AccountBasicinfo basicinfo = new AccountBasicinfo();
            basicinfo.set_id(hit.getId());
            // 源文档内容
            Map<String, Object> sourceAsMap = hit.getSourceAsMap();
            basicinfo.setDeviceid((String) sourceAsMap.get("deviceid"));
            basicinfo.setChannel((String) sourceAsMap.get("channel"));
            basicinfo.setRegist_time((Long) sourceAsMap.get("regist_time"));
            basicinfoList.add(basicinfo);
        }
        log.info("first select end");

        //记录滚动id。
        String scrollId=response.getScrollId();
        //滚动查询部分，将从第10001条数据开始取。
        SearchHit[] scrollHits = response.getHits().getHits();
        int i = 0;
        while (scrollHits != null && scrollHits.length > 0 ) {
            //构造滚动查询条件
            SearchScrollRequest searchScrollRequest = new SearchScrollRequest(scrollId);
            searchScrollRequest.scroll(scroll);
            //响应必须是上面的响应对象，需要对上一层进行覆盖。
            try {
                response = client.scroll(searchScrollRequest, RequestOptions.DEFAULT);
            } catch (IOException e) {
                e.printStackTrace();
            }
            scrollId = response.getScrollId();
            scrollHits=response.getHits().getHits();

            //TODO：同上面一样，在这个位置可以对滚动查询到的从10001条数据开始的数据进行处理(封装实体类)，构成集合accountTypeVOList（假设我已经构成了集合）。
            for(SearchHit hit : scrollHits){
                AccountBasicinfo basicinfo = new AccountBasicinfo();
                basicinfo.set_id(hit.getId());
                // 源文档内容
                Map<String, Object> sourceAsMap = hit.getSourceAsMap();
                basicinfo.setDeviceid((String) sourceAsMap.get("deviceid"));
                basicinfo.setChannel((String) sourceAsMap.get("f_channel"));
                basicinfo.setRegist_time((Long) sourceAsMap.get("regist_time"));
                basicinfoList.add(basicinfo);
            }
            log.info("i:{} select end",i++);
//            resultList.add(accountTypeVOList);
        }

        //TODO：在循环结束后可以遍历resultList这个大集合，来实现我们自己的需求，我这里是获取账号分类（由于我这里需要调用其它项目完成账号分类的获取，代码就不再贴了，感觉冗余。读者需要明白这里是实现自己的业务需求）。


        //数据获取完毕后需要清楚滚动，否则影响下次查询。
        ClearScrollRequest clearScrollRequest = new ClearScrollRequest();
        clearScrollRequest.addScrollId(scrollId);
        ClearScrollResponse clearScrollResponse = null;
        try {
            clearScrollResponse = client.clearScroll(clearScrollRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //清除滚动是否成功
        boolean isSuccess = clearScrollResponse.isSucceeded();
        log.info("=====================>清楚滚动scroll是否成功：{}",isSuccess);
        return basicinfoList;
    }

    public SearchResponse getScrollt1(String field, String key) {
        final long startTime = System.currentTimeMillis();
        //构造es查询条件。
        SearchRequest searchRequest = new SearchRequest("wecar_car_acct");
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        // 设置精确返回总数量
        sourceBuilder.trackTotalHits(true);

        sourceBuilder.query(QueryBuilders.termQuery(field, key))
            //设置最多一次能够取出10000条数据，从第10001条数据开始，将开启滚动查询。
            .size(10000)
            .fetchSource(new String[]{"f_channel","deviceid", "regist_time", "device_auth_state*"},null);
        searchRequest.source(sourceBuilder);
        //设置scroll超时时间(10min)。
        Scroll scroll=new Scroll(TimeValue.timeValueMinutes(10L));
        //放入滚动查询对象。
        searchRequest.scroll(scroll);
        SearchResponse response = null;
        try {
            response = client.search(searchRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("getScrollt1 key:{} cost:{}  response:{}"
            ,key,(System.currentTimeMillis() - startTime),response.status());
        return response;
    }

    public SearchResponse getScrollt2(SearchResponse response) {
        final long startTime = System.currentTimeMillis();
        Scroll scroll=new Scroll(TimeValue.timeValueMinutes(10L));
        //构造滚动查询条件
        SearchScrollRequest searchScrollRequest = new SearchScrollRequest(response.getScrollId());
        searchScrollRequest.scroll(scroll);
        //响应必须是上面的响应对象，需要对上一层进行覆盖。
        try {
            response = client.scroll(searchScrollRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("getScrollt2 cost:{} response:{}",(System.currentTimeMillis() - startTime),response.status());
        return response;
    }

    public ClearScrollResponse getScrollt3(SearchResponse response) {
        final long startTime = System.currentTimeMillis();
        //数据获取完毕后需要清楚滚动，否则影响下次查询。
        ClearScrollRequest clearScrollRequest = new ClearScrollRequest();
        clearScrollRequest.addScrollId(response.getScrollId());
        ClearScrollResponse clearScrollResponse = null;
        try {
            clearScrollResponse = client.clearScroll(clearScrollRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //清除滚动是否成功
        boolean isSuccess = clearScrollResponse.isSucceeded();
        log.info("getScrollt3 cost:{} clearScrollResponse:{}"
            ,(System.currentTimeMillis() - startTime),clearScrollResponse.status());
        return clearScrollResponse;
    }



    public List<AccountBasicinfo> redoAccountTypeByScrollv2(String field, String key) {
        List<AccountBasicinfo> basicinfoList = new ArrayList<>();

        //构造es查询条件。
        SearchRequest searchRequest = new SearchRequest("wecar_car_acct");
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();

        sourceBuilder.query(QueryBuilders.termsQuery(field, key))
            //设置最多一次能够取出10000条数据，从第10001条数据开始，将开启滚动查询。
            .size(10000)
            .fetchSource(new String[]{"f_channel","deviceid", "regist_time", "device_auth_state*"},null);
        searchRequest.source(sourceBuilder);
        //设置scroll超时时间(10min)。
        Scroll scroll=new Scroll(TimeValue.timeValueMinutes(10L));
        //放入滚动查询对象。
        searchRequest.scroll(scroll);
        SearchResponse response = null;
        try {
            response = client.search(searchRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //TODO：这里可以解析response对象，获取前10000条数据，封装实体类对象（属性为uid和type），并构成集合accountTypeVOList。我这里假设已经解析response对象完成，得到了accountTypeVOList集合。
        SearchHit[] hits = response.getHits().getHits();
        for(SearchHit hit : hits){
            AccountBasicinfo basicinfo = new AccountBasicinfo();
            basicinfo.set_id(hit.getId());
            // 源文档内容
            Map<String, Object> sourceAsMap = hit.getSourceAsMap();
            basicinfo.setDeviceid((String) sourceAsMap.get("deviceid"));
            basicinfo.setChannel((String) sourceAsMap.get("f_channel"));
            basicinfo.setRegist_time((Long) sourceAsMap.get("regist_time"));
            basicinfoList.add(basicinfo);
        }
        log.info("first select end");

        //记录滚动id。
        String scrollId=response.getScrollId();
        //滚动查询部分，将从第10001条数据开始取。
        SearchHit[] scrollHits = response.getHits().getHits();
        int i = 0;
        while (scrollHits != null && scrollHits.length > 0 ) {
            //构造滚动查询条件
            SearchScrollRequest searchScrollRequest = new SearchScrollRequest(scrollId);
            searchScrollRequest.scroll(scroll);
            //响应必须是上面的响应对象，需要对上一层进行覆盖。
            try {
                response = client.scroll(searchScrollRequest, RequestOptions.DEFAULT);
            } catch (IOException e) {
                e.printStackTrace();
            }
            scrollId = response.getScrollId();
            scrollHits=response.getHits().getHits();

            //TODO：同上面一样，在这个位置可以对滚动查询到的从10001条数据开始的数据进行处理(封装实体类)，构成集合accountTypeVOList（假设我已经构成了集合）。
            for(SearchHit hit : scrollHits){
                AccountBasicinfo basicinfo = new AccountBasicinfo();
                basicinfo.set_id(hit.getId());
                // 源文档内容
                Map<String, Object> sourceAsMap = hit.getSourceAsMap();
                basicinfo.setDeviceid((String) sourceAsMap.get("deviceid"));
                basicinfo.setChannel((String) sourceAsMap.get("f_channel"));
                basicinfo.setRegist_time((Long) sourceAsMap.get("regist_time"));
                basicinfoList.add(basicinfo);
            }
            log.info("i:{} select end",i++);
        }

        //数据获取完毕后需要清楚滚动，否则影响下次查询。
        ClearScrollRequest clearScrollRequest = new ClearScrollRequest();
        clearScrollRequest.addScrollId(scrollId);
        ClearScrollResponse clearScrollResponse = null;
        try {
            clearScrollResponse = client.clearScroll(clearScrollRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //清除滚动是否成功
        boolean isSuccess = clearScrollResponse.isSucceeded();
        log.info("=====================>清楚滚动scroll是否成功：{}",isSuccess);
        return basicinfoList;
    }


}
