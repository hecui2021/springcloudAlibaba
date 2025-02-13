package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcFilingsReviewInfo;
import com.lix7.bossserver.pojo.TcFilingsReviewInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcFilingsReviewInfoMapper {
    long countByExample(TcFilingsReviewInfoExample example);

    int deleteByExample(TcFilingsReviewInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcFilingsReviewInfo row);

    int insertSelective(TcFilingsReviewInfo row);

    List<TcFilingsReviewInfo> selectByExample(TcFilingsReviewInfoExample example);

    TcFilingsReviewInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcFilingsReviewInfo row, @Param("example") TcFilingsReviewInfoExample example);

    int updateByExample(@Param("row") TcFilingsReviewInfo row, @Param("example") TcFilingsReviewInfoExample example);

    int updateByPrimaryKeySelective(TcFilingsReviewInfo row);

    int updateByPrimaryKey(TcFilingsReviewInfo row);
}