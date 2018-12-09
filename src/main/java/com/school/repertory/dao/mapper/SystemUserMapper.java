package com.school.repertory.dao.mapper;

import com.school.repertory.dao.model.SystemUser;
import com.school.repertory.dao.model.SystemUserExample;
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

public interface SystemUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    @SelectProvider(type=SystemUserSqlProvider.class, method="countByExample")
    long countByExample(SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    @DeleteProvider(type=SystemUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    @Delete({
        "delete from system_user",
        "where user_username = #{userUsername,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String userUsername);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    @Insert({
        "insert into system_user (user_username, user_password, ",
        "user_fullname, user_sex, ",
        "user_phone, user_address, ",
        "user_is_super_admin)",
        "values (#{userUsername,jdbcType=VARCHAR}, #{userPassword,jdbcType=VARCHAR}, ",
        "#{userFullname,jdbcType=VARCHAR}, #{userSex,jdbcType=VARCHAR}, ",
        "#{userPhone,jdbcType=VARCHAR}, #{userAddress,jdbcType=VARCHAR}, ",
        "#{userIsSuperAdmin,jdbcType=BIT})"
    })
    int insert(SystemUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    @InsertProvider(type=SystemUserSqlProvider.class, method="insertSelective")
    int insertSelective(SystemUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    @SelectProvider(type=SystemUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="user_username", property="userUsername", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_password", property="userPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_fullname", property="userFullname", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_sex", property="userSex", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_phone", property="userPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_address", property="userAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_is_super_admin", property="userIsSuperAdmin", jdbcType=JdbcType.BIT)
    })
    List<SystemUser> selectByExample(SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "user_username, user_password, user_fullname, user_sex, user_phone, user_address, ",
        "user_is_super_admin",
        "from system_user",
        "where user_username = #{userUsername,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="user_username", property="userUsername", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_password", property="userPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_fullname", property="userFullname", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_sex", property="userSex", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_phone", property="userPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_address", property="userAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_is_super_admin", property="userIsSuperAdmin", jdbcType=JdbcType.BIT)
    })
    SystemUser selectByPrimaryKey(String userUsername);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    @UpdateProvider(type=SystemUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SystemUser record, @Param("example") SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    @UpdateProvider(type=SystemUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SystemUser record, @Param("example") SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    @UpdateProvider(type=SystemUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SystemUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    @Update({
        "update system_user",
        "set user_password = #{userPassword,jdbcType=VARCHAR},",
          "user_fullname = #{userFullname,jdbcType=VARCHAR},",
          "user_sex = #{userSex,jdbcType=VARCHAR},",
          "user_phone = #{userPhone,jdbcType=VARCHAR},",
          "user_address = #{userAddress,jdbcType=VARCHAR},",
          "user_is_super_admin = #{userIsSuperAdmin,jdbcType=BIT}",
        "where user_username = #{userUsername,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(SystemUser record);
}