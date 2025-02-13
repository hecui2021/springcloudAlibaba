package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcProgramLanguage;
import com.lix7.bossserver.pojo.TcProgramLanguageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcProgramLanguageMapper {
    long countByExample(TcProgramLanguageExample example);

    int deleteByExample(TcProgramLanguageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcProgramLanguage row);

    int insertSelective(TcProgramLanguage row);

    List<TcProgramLanguage> selectByExample(TcProgramLanguageExample example);

    TcProgramLanguage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcProgramLanguage row, @Param("example") TcProgramLanguageExample example);

    int updateByExample(@Param("row") TcProgramLanguage row, @Param("example") TcProgramLanguageExample example);

    int updateByPrimaryKeySelective(TcProgramLanguage row);

    int updateByPrimaryKey(TcProgramLanguage row);
}