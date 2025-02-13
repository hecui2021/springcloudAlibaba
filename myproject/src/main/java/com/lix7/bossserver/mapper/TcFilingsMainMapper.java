package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcFilingsMain;
import com.lix7.bossserver.pojo.TcFilingsMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcFilingsMainMapper {
    long countByExample(TcFilingsMainExample example);

    int deleteByExample(TcFilingsMainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcFilingsMain row);

    int insertSelective(TcFilingsMain row);

    List<TcFilingsMain> selectByExample(TcFilingsMainExample example);

    TcFilingsMain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcFilingsMain row, @Param("example") TcFilingsMainExample example);

    int updateByExample(@Param("row") TcFilingsMain row, @Param("example") TcFilingsMainExample example);

    int updateByPrimaryKeySelective(TcFilingsMain row);

    int updateByPrimaryKey(TcFilingsMain row);
}