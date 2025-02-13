package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcWecarReconciliationTask;
import com.lix7.bossserver.pojo.TcWecarReconciliationTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcWecarReconciliationTaskMapper {
    long countByExample(TcWecarReconciliationTaskExample example);

    int deleteByExample(TcWecarReconciliationTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcWecarReconciliationTask row);

    int insertSelective(TcWecarReconciliationTask row);

    List<TcWecarReconciliationTask> selectByExample(TcWecarReconciliationTaskExample example);

    TcWecarReconciliationTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcWecarReconciliationTask row, @Param("example") TcWecarReconciliationTaskExample example);

    int updateByExample(@Param("row") TcWecarReconciliationTask row, @Param("example") TcWecarReconciliationTaskExample example);

    int updateByPrimaryKeySelective(TcWecarReconciliationTask row);

    int updateByPrimaryKey(TcWecarReconciliationTask row);
}