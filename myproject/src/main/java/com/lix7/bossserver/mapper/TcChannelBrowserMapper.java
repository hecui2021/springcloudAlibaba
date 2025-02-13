package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcChannelBrowser;
import com.lix7.bossserver.pojo.TcChannelBrowserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcChannelBrowserMapper {
    long countByExample(TcChannelBrowserExample example);

    int deleteByExample(TcChannelBrowserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcChannelBrowser row);

    int insertSelective(TcChannelBrowser row);

    List<TcChannelBrowser> selectByExample(TcChannelBrowserExample example);

    TcChannelBrowser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcChannelBrowser row, @Param("example") TcChannelBrowserExample example);

    int updateByExample(@Param("row") TcChannelBrowser row, @Param("example") TcChannelBrowserExample example);

    int updateByPrimaryKeySelective(TcChannelBrowser row);

    int updateByPrimaryKey(TcChannelBrowser row);
}