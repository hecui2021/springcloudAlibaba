package com.study.mapper;

import com.study.pojo.TcAgentQuery;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author peterche
 * @description:
 * @date 2025-01-20
 */
@Mapper
public interface TcAgentQueryMapper {

    @Insert("insert into tc_agent_query (app, type, query) values (#{app}, #{type}, #{query});")
    int insert(TcAgentQuery query);

    @Select("select id,app, type, query, result, result_app as resultApp, result_type as resultType from tc_agent_query")
    List<TcAgentQuery> selectAll();

    @Update("update tc_agent_query set result = #{result}, result_app = #{resultApp}, result_type = #{resultType} where id = #{id} limit 1")
    int updateResult(TcAgentQuery query);
}
