package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcLicenseTsc;
import com.lix7.bossserver.pojo.TcLicenseTscExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcLicenseTscMapper {
    long countByExample(TcLicenseTscExample example);

    int deleteByExample(TcLicenseTscExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcLicenseTsc row);

    int insertSelective(TcLicenseTsc row);

    List<TcLicenseTsc> selectByExample(TcLicenseTscExample example);

    TcLicenseTsc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcLicenseTsc row, @Param("example") TcLicenseTscExample example);

    int updateByExample(@Param("row") TcLicenseTsc row, @Param("example") TcLicenseTscExample example);

    int updateByPrimaryKeySelective(TcLicenseTsc row);

    int updateByPrimaryKey(TcLicenseTsc row);
}