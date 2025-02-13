package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcChannelBrowserConfig;
import com.lix7.bossserver.pojo.TcChannelBrowserConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcChannelBrowserConfigMapper {
    long countByExample(TcChannelBrowserConfigExample example);

    int deleteByExample(TcChannelBrowserConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcChannelBrowserConfig row);

    int insertSelective(TcChannelBrowserConfig row);

    List<TcChannelBrowserConfig> selectByExample(TcChannelBrowserConfigExample example);

    TcChannelBrowserConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcChannelBrowserConfig row, @Param("example") TcChannelBrowserConfigExample example);

    int updateByExample(@Param("row") TcChannelBrowserConfig row, @Param("example") TcChannelBrowserConfigExample example);

    int updateByPrimaryKeySelective(TcChannelBrowserConfig row);

    int updateByPrimaryKey(TcChannelBrowserConfig row);
}