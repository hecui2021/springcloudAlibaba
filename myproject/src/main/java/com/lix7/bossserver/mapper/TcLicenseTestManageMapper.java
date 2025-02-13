package com.lix7.bossserver.mapper;

import com.lix7.bossserver.pojo.TcLicenseTestManage;
import com.lix7.bossserver.pojo.TcLicenseTestManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcLicenseTestManageMapper {
    long countByExample(TcLicenseTestManageExample example);

    int deleteByExample(TcLicenseTestManageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcLicenseTestManage row);

    int insertSelective(TcLicenseTestManage row);

    List<TcLicenseTestManage> selectByExample(TcLicenseTestManageExample example);

    TcLicenseTestManage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TcLicenseTestManage row, @Param("example") TcLicenseTestManageExample example);

    int updateByExample(@Param("row") TcLicenseTestManage row, @Param("example") TcLicenseTestManageExample example);

    int updateByPrimaryKeySelective(TcLicenseTestManage row);

    int updateByPrimaryKey(TcLicenseTestManage row);
}