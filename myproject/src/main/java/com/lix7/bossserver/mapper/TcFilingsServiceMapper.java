package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcFilingsService;
import com.lix7.bossserver.pojo.TcFilingsServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcFilingsServiceMapper {
    long countByExample(TcFilingsServiceExample example);

    int deleteByExample(TcFilingsServiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcFilingsService row);

    int insertSelective(TcFilingsService row);

    List<TcFilingsService> selectByExample(TcFilingsServiceExample example);

    TcFilingsService selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcFilingsService row, @Param("example") TcFilingsServiceExample example);

    int updateByExample(@Param("row") TcFilingsService row, @Param("example") TcFilingsServiceExample example);

    int updateByPrimaryKeySelective(TcFilingsService row);

    int updateByPrimaryKey(TcFilingsService row);
}