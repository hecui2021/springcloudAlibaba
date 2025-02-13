package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcWxIotConfig;
import com.lix7.bossserver.pojo.TcWxIotConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcWxIotConfigMapper {
    long countByExample(TcWxIotConfigExample example);

    int deleteByExample(TcWxIotConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcWxIotConfig row);

    int insertSelective(TcWxIotConfig row);

    List<TcWxIotConfig> selectByExampleWithBLOBs(TcWxIotConfigExample example);

    List<TcWxIotConfig> selectByExample(TcWxIotConfigExample example);

    TcWxIotConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcWxIotConfig row, @Param("example") TcWxIotConfigExample example);

    int updateByExampleWithBLOBs(@Param("row") TcWxIotConfig row, @Param("example") TcWxIotConfigExample example);

    int updateByExample(@Param("row") TcWxIotConfig row, @Param("example") TcWxIotConfigExample example);

    int updateByPrimaryKeySelective(TcWxIotConfig row);

    int updateByPrimaryKeyWithBLOBs(TcWxIotConfig row);

    int updateByPrimaryKey(TcWxIotConfig row);
}