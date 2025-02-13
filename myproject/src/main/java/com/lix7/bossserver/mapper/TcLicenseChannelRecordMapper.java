package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcLicenseChannelRecord;
import com.lix7.bossserver.pojo.TcLicenseChannelRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcLicenseChannelRecordMapper {
    long countByExample(TcLicenseChannelRecordExample example);

    int deleteByExample(TcLicenseChannelRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcLicenseChannelRecord row);

    int insertSelective(TcLicenseChannelRecord row);

    List<TcLicenseChannelRecord> selectByExampleWithBLOBs(TcLicenseChannelRecordExample example);

    List<TcLicenseChannelRecord> selectByExample(TcLicenseChannelRecordExample example);

    TcLicenseChannelRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcLicenseChannelRecord row, @Param("example") TcLicenseChannelRecordExample example);

    int updateByExampleWithBLOBs(@Param("row") TcLicenseChannelRecord row, @Param("example") TcLicenseChannelRecordExample example);

    int updateByExample(@Param("row") TcLicenseChannelRecord row, @Param("example") TcLicenseChannelRecordExample example);

    int updateByPrimaryKeySelective(TcLicenseChannelRecord row);

    int updateByPrimaryKeyWithBLOBs(TcLicenseChannelRecord row);

    int updateByPrimaryKey(TcLicenseChannelRecord row);
}