package com.school.repertory.dao.mapper;

import com.school.repertory.dao.model.Goods;
import com.school.repertory.dao.model.GoodsExample;
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

public interface GoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @SelectProvider(type=GoodsSqlProvider.class, method="countByExample")
    long countByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @DeleteProvider(type=GoodsSqlProvider.class, method="deleteByExample")
    int deleteByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @Delete({
        "delete from goods",
        "where goods_no = #{goodsNo,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String goodsNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @Insert({
        "insert into goods (goods_no, goods_name, ",
        "goods_size_length, goods_size_width, ",
        "goods_size_height, goods_value)",
        "values (#{goodsNo,jdbcType=VARCHAR}, #{goodsName,jdbcType=VARCHAR}, ",
        "#{goodsSizeLength,jdbcType=DECIMAL}, #{goodsSizeWidth,jdbcType=DECIMAL}, ",
        "#{goodsSizeHeight,jdbcType=DECIMAL}, #{goodsValue,jdbcType=DECIMAL})"
    })
    int insert(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @InsertProvider(type=GoodsSqlProvider.class, method="insertSelective")
    int insertSelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @SelectProvider(type=GoodsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="goods_no", property="goodsNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_size_length", property="goodsSizeLength", jdbcType=JdbcType.DECIMAL),
        @Result(column="goods_size_width", property="goodsSizeWidth", jdbcType=JdbcType.DECIMAL),
        @Result(column="goods_size_height", property="goodsSizeHeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="goods_value", property="goodsValue", jdbcType=JdbcType.DECIMAL)
    })
    List<Goods> selectByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "goods_no, goods_name, goods_size_length, goods_size_width, goods_size_height, ",
        "goods_value",
        "from goods",
        "where goods_no = #{goodsNo,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="goods_no", property="goodsNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_size_length", property="goodsSizeLength", jdbcType=JdbcType.DECIMAL),
        @Result(column="goods_size_width", property="goodsSizeWidth", jdbcType=JdbcType.DECIMAL),
        @Result(column="goods_size_height", property="goodsSizeHeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="goods_value", property="goodsValue", jdbcType=JdbcType.DECIMAL)
    })
    Goods selectByPrimaryKey(String goodsNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated
     */
    @Update({
        "update goods",
        "set goods_name = #{goodsName,jdbcType=VARCHAR},",
          "goods_size_length = #{goodsSizeLength,jdbcType=DECIMAL},",
          "goods_size_width = #{goodsSizeWidth,jdbcType=DECIMAL},",
          "goods_size_height = #{goodsSizeHeight,jdbcType=DECIMAL},",
          "goods_value = #{goodsValue,jdbcType=DECIMAL}",
        "where goods_no = #{goodsNo,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Goods record);
}