package com.school.repertory.dao.mapper;

import com.school.repertory.dao.model.AccessLog;
import com.school.repertory.dao.model.AccessLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface AccessLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    @SelectProvider(type=AccessLogSqlProvider.class, method="countByExample")
    long countByExample(AccessLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    @DeleteProvider(type=AccessLogSqlProvider.class, method="deleteByExample")
    int deleteByExample(AccessLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    @Delete({
        "delete from access_log",
        "where access_id = #{accessId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer accessId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    @Insert({
        "insert into access_log (access_id, access_username, ",
        "access_action, access_dt)",
        "values (#{accessId,jdbcType=INTEGER}, #{accessUsername,jdbcType=VARCHAR}, ",
        "#{accessAction,jdbcType=VARCHAR}, #{accessDt,jdbcType=TIMESTAMP})"
    })
    int insert(AccessLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    @InsertProvider(type=AccessLogSqlProvider.class, method="insertSelective")
    int insertSelective(AccessLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    @SelectProvider(type=AccessLogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="access_id", property="accessId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="access_username", property="accessUsername", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_action", property="accessAction", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_dt", property="accessDt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AccessLog> selectByExample(AccessLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "access_id, access_username, access_action, access_dt",
        "from access_log",
        "where access_id = #{accessId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="access_id", property="accessId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="access_username", property="accessUsername", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_action", property="accessAction", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_dt", property="accessDt", jdbcType=JdbcType.TIMESTAMP)
    })
    AccessLog selectByPrimaryKey(Integer accessId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    @UpdateProvider(type=AccessLogSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AccessLog record, @Param("example") AccessLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    @UpdateProvider(type=AccessLogSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AccessLog record, @Param("example") AccessLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    @UpdateProvider(type=AccessLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AccessLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table access_log
     *
     * @mbg.generated
     */
    @Update({
        "update access_log",
        "set access_username = #{accessUsername,jdbcType=VARCHAR},",
          "access_action = #{accessAction,jdbcType=VARCHAR},",
          "access_dt = #{accessDt,jdbcType=TIMESTAMP}",
        "where access_id = #{accessId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AccessLog record);
}