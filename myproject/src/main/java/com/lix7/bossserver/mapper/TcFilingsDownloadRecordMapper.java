package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcFilingsDownloadRecord;
import com.lix7.bossserver.pojo.TcFilingsDownloadRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcFilingsDownloadRecordMapper {
    long countByExample(TcFilingsDownloadRecordExample example);

    int deleteByExample(TcFilingsDownloadRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcFilingsDownloadRecord row);

    int insertSelective(TcFilingsDownloadRecord row);

    List<TcFilingsDownloadRecord> selectByExampleWithBLOBs(TcFilingsDownloadRecordExample example);

    List<TcFilingsDownloadRecord> selectByExample(TcFilingsDownloadRecordExample example);

    TcFilingsDownloadRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcFilingsDownloadRecord row, @Param("example") TcFilingsDownloadRecordExample example);

    int updateByExampleWithBLOBs(@Param("row") TcFilingsDownloadRecord row, @Param("example") TcFilingsDownloadRecordExample example);

    int updateByExample(@Param("row") TcFilingsDownloadRecord row, @Param("example") TcFilingsDownloadRecordExample example);

    int updateByPrimaryKeySelective(TcFilingsDownloadRecord row);

    int updateByPrimaryKeyWithBLOBs(TcFilingsDownloadRecord row);

    int updateByPrimaryKey(TcFilingsDownloadRecord row);
}