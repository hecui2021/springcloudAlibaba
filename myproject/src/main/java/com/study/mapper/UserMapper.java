package com.study.mapper;

import com.study.pojo.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> selectAll();

}
