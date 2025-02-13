package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcAuditLog;
import com.lix7.bossserver.pojo.TcAuditLogExample;
import com.lix7.bossserver.pojo.TcAuditLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcAuditLogMapper {
    long countByExample(TcAuditLogExample example);

    int deleteByExample(TcAuditLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcAuditLogWithBLOBs row);

    int insertSelective(TcAuditLogWithBLOBs row);

    List<TcAuditLogWithBLOBs> selectByExampleWithBLOBs(TcAuditLogExample example);

    List<TcAuditLog> selectByExample(TcAuditLogExample example);

    TcAuditLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcAuditLogWithBLOBs row, @Param("example") TcAuditLogExample example);

    int updateByExampleWithBLOBs(@Param("row") TcAuditLogWithBLOBs row, @Param("example") TcAuditLogExample example);

    int updateByExample(@Param("row") TcAuditLog row, @Param("example") TcAuditLogExample example);

    int updateByPrimaryKeySelective(TcAuditLogWithBLOBs row);

    int updateByPrimaryKeyWithBLOBs(TcAuditLogWithBLOBs row);

    int updateByPrimaryKey(TcAuditLog row);
}