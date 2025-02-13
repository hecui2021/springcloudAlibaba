package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.Vin;
import com.lix7.bossserver.pojo.VinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VinMapper {
    long countByExample(VinExample example);

    int deleteByExample(VinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vin row);

    int insertSelective(Vin row);

    List<Vin> selectByExample(VinExample example);

    Vin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Vin row, @Param("example") VinExample example);

    int updateByExample(@Param("row") Vin row, @Param("example") VinExample example);

    int updateByPrimaryKeySelective(Vin row);

    int updateByPrimaryKey(Vin row);
}