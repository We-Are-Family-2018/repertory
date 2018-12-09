package com.school.repertory.dao.mapper;

import com.school.repertory.dao.model.OutRecord;
import com.school.repertory.dao.model.OutRecordExample;
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

public interface OutRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_record
     *
     * @mbg.generated
     */
    @SelectProvider(type=OutRecordSqlProvider.class, method="countByExample")
    long countByExample(OutRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_record
     *
     * @mbg.generated
     */
    @DeleteProvider(type=OutRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(OutRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_record
     *
     * @mbg.generated
     */
    @Delete({
        "delete from out_record",
        "where out_record_id = #{outRecordId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer outRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_record
     *
     * @mbg.generated
     */
    @Insert({
        "insert into out_record (out_record_id, out_record_customer_no, ",
        "out_record_goods_no, out_record_count, ",
        "out_record_dt, out_record_person_no)",
        "values (#{outRecordId,jdbcType=INTEGER}, #{outRecordCustomerNo,jdbcType=VARCHAR}, ",
        "#{outRecordGoodsNo,jdbcType=VARCHAR}, #{outRecordCount,jdbcType=INTEGER}, ",
        "#{outRecordDt,jdbcType=TIMESTAMP}, #{outRecordPersonNo,jdbcType=VARCHAR})"
    })
    int insert(OutRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_record
     *
     * @mbg.generated
     */
    @InsertProvider(type=OutRecordSqlProvider.class, method="insertSelective")
    int insertSelective(OutRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_record
     *
     * @mbg.generated
     */
    @SelectProvider(type=OutRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="out_record_id", property="outRecordId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="out_record_customer_no", property="outRecordCustomerNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="out_record_goods_no", property="outRecordGoodsNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="out_record_count", property="outRecordCount", jdbcType=JdbcType.INTEGER),
        @Result(column="out_record_dt", property="outRecordDt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="out_record_person_no", property="outRecordPersonNo", jdbcType=JdbcType.VARCHAR)
    })
    List<OutRecord> selectByExample(OutRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_record
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "out_record_id, out_record_customer_no, out_record_goods_no, out_record_count, ",
        "out_record_dt, out_record_person_no",
        "from out_record",
        "where out_record_id = #{outRecordId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="out_record_id", property="outRecordId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="out_record_customer_no", property="outRecordCustomerNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="out_record_goods_no", property="outRecordGoodsNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="out_record_count", property="outRecordCount", jdbcType=JdbcType.INTEGER),
        @Result(column="out_record_dt", property="outRecordDt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="out_record_person_no", property="outRecordPersonNo", jdbcType=JdbcType.VARCHAR)
    })
    OutRecord selectByPrimaryKey(Integer outRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_record
     *
     * @mbg.generated
     */
    @UpdateProvider(type=OutRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OutRecord record, @Param("example") OutRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_record
     *
     * @mbg.generated
     */
    @UpdateProvider(type=OutRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OutRecord record, @Param("example") OutRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_record
     *
     * @mbg.generated
     */
    @UpdateProvider(type=OutRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OutRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_record
     *
     * @mbg.generated
     */
    @Update({
        "update out_record",
        "set out_record_customer_no = #{outRecordCustomerNo,jdbcType=VARCHAR},",
          "out_record_goods_no = #{outRecordGoodsNo,jdbcType=VARCHAR},",
          "out_record_count = #{outRecordCount,jdbcType=INTEGER},",
          "out_record_dt = #{outRecordDt,jdbcType=TIMESTAMP},",
          "out_record_person_no = #{outRecordPersonNo,jdbcType=VARCHAR}",
        "where out_record_id = #{outRecordId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(OutRecord record);
}