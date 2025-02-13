package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcFilingsBasic;
import com.lix7.bossserver.pojo.TcFilingsBasicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcFilingsBasicMapper {
    long countByExample(TcFilingsBasicExample example);

    int deleteByExample(TcFilingsBasicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcFilingsBasic row);

    int insertSelective(TcFilingsBasic row);

    List<TcFilingsBasic> selectByExample(TcFilingsBasicExample example);

    TcFilingsBasic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcFilingsBasic row, @Param("example") TcFilingsBasicExample example);

    int updateByExample(@Param("row") TcFilingsBasic row, @Param("example") TcFilingsBasicExample example);

    int updateByPrimaryKeySelective(TcFilingsBasic row);

    int updateByPrimaryKey(TcFilingsBasic row);
}