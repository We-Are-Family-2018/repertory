package com.school.repertory.dao.mapper;

import com.school.repertory.dao.model.InRecord;
import com.school.repertory.dao.model.InRecordExample;
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

public interface InRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_record
     *
     * @mbg.generated
     */
    @SelectProvider(type=InRecordSqlProvider.class, method="countByExample")
    long countByExample(InRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_record
     *
     * @mbg.generated
     */
    @DeleteProvider(type=InRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(InRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_record
     *
     * @mbg.generated
     */
    @Delete({
        "delete from in_record",
        "where in_record_id = #{inRecordId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer inRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_record
     *
     * @mbg.generated
     */
    @Insert({
        "insert into in_record (in_record_id, in_record_supplier_no, ",
        "in_record_goods_no, in_record_count, ",
        "in_record_dt, in_record_person_no)",
        "values (#{inRecordId,jdbcType=INTEGER}, #{inRecordSupplierNo,jdbcType=VARCHAR}, ",
        "#{inRecordGoodsNo,jdbcType=VARCHAR}, #{inRecordCount,jdbcType=INTEGER}, ",
        "#{inRecordDt,jdbcType=TIMESTAMP}, #{inRecordPersonNo,jdbcType=VARCHAR})"
    })
    int insert(InRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_record
     *
     * @mbg.generated
     */
    @InsertProvider(type=InRecordSqlProvider.class, method="insertSelective")
    int insertSelective(InRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_record
     *
     * @mbg.generated
     */
    @SelectProvider(type=InRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="in_record_id", property="inRecordId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="in_record_supplier_no", property="inRecordSupplierNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="in_record_goods_no", property="inRecordGoodsNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="in_record_count", property="inRecordCount", jdbcType=JdbcType.INTEGER),
        @Result(column="in_record_dt", property="inRecordDt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="in_record_person_no", property="inRecordPersonNo", jdbcType=JdbcType.VARCHAR)
    })
    List<InRecord> selectByExample(InRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_record
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "in_record_id, in_record_supplier_no, in_record_goods_no, in_record_count, in_record_dt, ",
        "in_record_person_no",
        "from in_record",
        "where in_record_id = #{inRecordId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="in_record_id", property="inRecordId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="in_record_supplier_no", property="inRecordSupplierNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="in_record_goods_no", property="inRecordGoodsNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="in_record_count", property="inRecordCount", jdbcType=JdbcType.INTEGER),
        @Result(column="in_record_dt", property="inRecordDt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="in_record_person_no", property="inRecordPersonNo", jdbcType=JdbcType.VARCHAR)
    })
    InRecord selectByPrimaryKey(Integer inRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_record
     *
     * @mbg.generated
     */
    @UpdateProvider(type=InRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InRecord record, @Param("example") InRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_record
     *
     * @mbg.generated
     */
    @UpdateProvider(type=InRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InRecord record, @Param("example") InRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_record
     *
     * @mbg.generated
     */
    @UpdateProvider(type=InRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(InRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_record
     *
     * @mbg.generated
     */
    @Update({
        "update in_record",
        "set in_record_supplier_no = #{inRecordSupplierNo,jdbcType=VARCHAR},",
          "in_record_goods_no = #{inRecordGoodsNo,jdbcType=VARCHAR},",
          "in_record_count = #{inRecordCount,jdbcType=INTEGER},",
          "in_record_dt = #{inRecordDt,jdbcType=TIMESTAMP},",
          "in_record_person_no = #{inRecordPersonNo,jdbcType=VARCHAR}",
        "where in_record_id = #{inRecordId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(InRecord record);
}