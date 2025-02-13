package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcFilingsInfo;
import com.lix7.bossserver.pojo.TcFilingsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcFilingsInfoMapper {
    long countByExample(TcFilingsInfoExample example);

    int deleteByExample(TcFilingsInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcFilingsInfo row);

    int insertSelective(TcFilingsInfo row);

    List<TcFilingsInfo> selectByExample(TcFilingsInfoExample example);

    TcFilingsInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcFilingsInfo row, @Param("example") TcFilingsInfoExample example);

    int updateByExample(@Param("row") TcFilingsInfo row, @Param("example") TcFilingsInfoExample example);

    int updateByPrimaryKeySelective(TcFilingsInfo row);

    int updateByPrimaryKey(TcFilingsInfo row);
}