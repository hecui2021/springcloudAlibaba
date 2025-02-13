package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcLicenseChannelLmp;
import com.lix7.bossserver.pojo.TcLicenseChannelLmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcLicenseChannelLmpMapper {
    long countByExample(TcLicenseChannelLmpExample example);

    int deleteByExample(TcLicenseChannelLmpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcLicenseChannelLmp row);

    int insertSelective(TcLicenseChannelLmp row);

    List<TcLicenseChannelLmp> selectByExampleWithBLOBs(TcLicenseChannelLmpExample example);

    List<TcLicenseChannelLmp> selectByExample(TcLicenseChannelLmpExample example);

    TcLicenseChannelLmp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcLicenseChannelLmp row, @Param("example") TcLicenseChannelLmpExample example);

    int updateByExampleWithBLOBs(@Param("row") TcLicenseChannelLmp row, @Param("example") TcLicenseChannelLmpExample example);

    int updateByExample(@Param("row") TcLicenseChannelLmp row, @Param("example") TcLicenseChannelLmpExample example);

    int updateByPrimaryKeySelective(TcLicenseChannelLmp row);

    int updateByPrimaryKeyWithBLOBs(TcLicenseChannelLmp row);

    int updateByPrimaryKey(TcLicenseChannelLmp row);
}