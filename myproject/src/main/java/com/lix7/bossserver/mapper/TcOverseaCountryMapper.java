package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcOverseaCountry;
import com.lix7.bossserver.pojo.TcOverseaCountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcOverseaCountryMapper {
    long countByExample(TcOverseaCountryExample example);

    int deleteByExample(TcOverseaCountryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcOverseaCountry row);

    int insertSelective(TcOverseaCountry row);

    List<TcOverseaCountry> selectByExample(TcOverseaCountryExample example);

    TcOverseaCountry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcOverseaCountry row, @Param("example") TcOverseaCountryExample example);

    int updateByExample(@Param("row") TcOverseaCountry row, @Param("example") TcOverseaCountryExample example);

    int updateByPrimaryKeySelective(TcOverseaCountry row);

    int updateByPrimaryKey(TcOverseaCountry row);
}