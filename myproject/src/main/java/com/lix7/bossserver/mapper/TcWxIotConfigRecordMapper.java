package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcWxIotConfigRecord;
import com.lix7.bossserver.pojo.TcWxIotConfigRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcWxIotConfigRecordMapper {
    long countByExample(TcWxIotConfigRecordExample example);

    int deleteByExample(TcWxIotConfigRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcWxIotConfigRecord row);

    int insertSelective(TcWxIotConfigRecord row);

    List<TcWxIotConfigRecord> selectByExampleWithBLOBs(TcWxIotConfigRecordExample example);

    List<TcWxIotConfigRecord> selectByExample(TcWxIotConfigRecordExample example);

    TcWxIotConfigRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcWxIotConfigRecord row, @Param("example") TcWxIotConfigRecordExample example);

    int updateByExampleWithBLOBs(@Param("row") TcWxIotConfigRecord row, @Param("example") TcWxIotConfigRecordExample example);

    int updateByExample(@Param("row") TcWxIotConfigRecord row, @Param("example") TcWxIotConfigRecordExample example);

    int updateByPrimaryKeySelective(TcWxIotConfigRecord row);

    int updateByPrimaryKeyWithBLOBs(TcWxIotConfigRecord row);

    int updateByPrimaryKey(TcWxIotConfigRecord row);
}