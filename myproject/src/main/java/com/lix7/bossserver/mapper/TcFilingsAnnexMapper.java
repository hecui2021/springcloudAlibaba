package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcFilingsAnnex;
import com.lix7.bossserver.pojo.TcFilingsAnnexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcFilingsAnnexMapper {
    long countByExample(TcFilingsAnnexExample example);

    int deleteByExample(TcFilingsAnnexExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcFilingsAnnex row);

    int insertSelective(TcFilingsAnnex row);

    List<TcFilingsAnnex> selectByExample(TcFilingsAnnexExample example);

    TcFilingsAnnex selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcFilingsAnnex row, @Param("example") TcFilingsAnnexExample example);

    int updateByExample(@Param("row") TcFilingsAnnex row, @Param("example") TcFilingsAnnexExample example);

    int updateByPrimaryKeySelective(TcFilingsAnnex row);

    int updateByPrimaryKey(TcFilingsAnnex row);
}