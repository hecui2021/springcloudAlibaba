package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcFilingsApplyInfo;
import com.lix7.bossserver.pojo.TcFilingsApplyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcFilingsApplyInfoMapper {
    long countByExample(TcFilingsApplyInfoExample example);

    int deleteByExample(TcFilingsApplyInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcFilingsApplyInfo row);

    int insertSelective(TcFilingsApplyInfo row);

    List<TcFilingsApplyInfo> selectByExample(TcFilingsApplyInfoExample example);

    TcFilingsApplyInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcFilingsApplyInfo row, @Param("example") TcFilingsApplyInfoExample example);

    int updateByExample(@Param("row") TcFilingsApplyInfo row, @Param("example") TcFilingsApplyInfoExample example);

    int updateByPrimaryKeySelective(TcFilingsApplyInfo row);

    int updateByPrimaryKey(TcFilingsApplyInfo row);
}