package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcProgramBasicInfo;
import com.lix7.bossserver.pojo.TcProgramBasicInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcProgramBasicInfoMapper {
    long countByExample(TcProgramBasicInfoExample example);

    int deleteByExample(TcProgramBasicInfoExample example);

    int deleteByPrimaryKey(String programId);

    int insert(TcProgramBasicInfo row);

    int insertSelective(TcProgramBasicInfo row);

    List<TcProgramBasicInfo> selectByExample(TcProgramBasicInfoExample example);

    TcProgramBasicInfo selectByPrimaryKey(String programId);

    int updateByExampleSelective(@Param("row") TcProgramBasicInfo row, @Param("example") TcProgramBasicInfoExample example);

    int updateByExample(@Param("row") TcProgramBasicInfo row, @Param("example") TcProgramBasicInfoExample example);

    int updateByPrimaryKeySelective(TcProgramBasicInfo row);

    int updateByPrimaryKey(TcProgramBasicInfo row);
}