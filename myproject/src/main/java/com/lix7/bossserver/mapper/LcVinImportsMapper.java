package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.LcVinImports;
import com.lix7.bossserver.pojo.LcVinImportsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LcVinImportsMapper {
    long countByExample(LcVinImportsExample example);

    int deleteByExample(LcVinImportsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LcVinImports row);

    int insertSelective(LcVinImports row);

    List<LcVinImports> selectByExample(LcVinImportsExample example);

    LcVinImports selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") LcVinImports row, @Param("example") LcVinImportsExample example);

    int updateByExample(@Param("row") LcVinImports row, @Param("example") LcVinImportsExample example);

    int updateByPrimaryKeySelective(LcVinImports row);

    int updateByPrimaryKey(LcVinImports row);
}