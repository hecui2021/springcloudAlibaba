package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcLicenseChannelTsc;
import com.lix7.bossserver.pojo.TcLicenseChannelTscExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcLicenseChannelTscMapper {
    long countByExample(TcLicenseChannelTscExample example);

    int deleteByExample(TcLicenseChannelTscExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcLicenseChannelTsc row);

    int insertSelective(TcLicenseChannelTsc row);

    List<TcLicenseChannelTsc> selectByExample(TcLicenseChannelTscExample example);

    TcLicenseChannelTsc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcLicenseChannelTsc row, @Param("example") TcLicenseChannelTscExample example);

    int updateByExample(@Param("row") TcLicenseChannelTsc row, @Param("example") TcLicenseChannelTscExample example);

    int updateByPrimaryKeySelective(TcLicenseChannelTsc row);

    int updateByPrimaryKey(TcLicenseChannelTsc row);
}