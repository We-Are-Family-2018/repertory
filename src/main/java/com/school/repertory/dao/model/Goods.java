package com.school.repertory.dao.model;

import java.math.BigDecimal;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table goods
 */
public class Goods {
    /**
     * Database Column Remarks:
     *   货物编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goods_no
     *
     * @mbg.generated
     */
    private String goodsNo;

    /**
     * Database Column Remarks:
     *   货物名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goods_name
     *
     * @mbg.generated
     */
    private String goodsName;

    /**
     * Database Column Remarks:
     *   货物规格-长度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goods_size_length
     *
     * @mbg.generated
     */
    private BigDecimal goodsSizeLength;

    /**
     * Database Column Remarks:
     *   货物规格-宽度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goods_size_width
     *
     * @mbg.generated
     */
    private BigDecimal goodsSizeWidth;

    /**
     * Database Column Remarks:
     *   货物规格-高度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goods_size_height
     *
     * @mbg.generated
     */
    private BigDecimal goodsSizeHeight;

    /**
     * Database Column Remarks:
     *   货物成本价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goods_value
     *
     * @mbg.generated
     */
    private BigDecimal goodsValue;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goods_no
     *
     * @return the value of goods.goods_no
     *
     * @mbg.generated
     */
    public String getGoodsNo() {
        return goodsNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goods_no
     *
     * @param goodsNo the value for goods.goods_no
     *
     * @mbg.generated
     */
    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goods_name
     *
     * @return the value of goods.goods_name
     *
     * @mbg.generated
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goods_name
     *
     * @param goodsName the value for goods.goods_name
     *
     * @mbg.generated
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goods_size_length
     *
     * @return the value of goods.goods_size_length
     *
     * @mbg.generated
     */
    public BigDecimal getGoodsSizeLength() {
        return goodsSizeLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goods_size_length
     *
     * @param goodsSizeLength the value for goods.goods_size_length
     *
     * @mbg.generated
     */
    public void setGoodsSizeLength(BigDecimal goodsSizeLength) {
        this.goodsSizeLength = goodsSizeLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goods_size_width
     *
     * @return the value of goods.goods_size_width
     *
     * @mbg.generated
     */
    public BigDecimal getGoodsSizeWidth() {
        return goodsSizeWidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goods_size_width
     *
     * @param goodsSizeWidth the value for goods.goods_size_width
     *
     * @mbg.generated
     */
    public void setGoodsSizeWidth(BigDecimal goodsSizeWidth) {
        this.goodsSizeWidth = goodsSizeWidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goods_size_height
     *
     * @return the value of goods.goods_size_height
     *
     * @mbg.generated
     */
    public BigDecimal getGoodsSizeHeight() {
        return goodsSizeHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goods_size_height
     *
     * @param goodsSizeHeight the value for goods.goods_size_height
     *
     * @mbg.generated
     */
    public void setGoodsSizeHeight(BigDecimal goodsSizeHeight) {
        this.goodsSizeHeight = goodsSizeHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goods_value
     *
     * @return the value of goods.goods_value
     *
     * @mbg.generated
     */
    public BigDecimal getGoodsValue() {
        return goodsValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goods_value
     *
     * @param goodsValue the value for goods.goods_value
     *
     * @mbg.generated
     */
    public void setGoodsValue(BigDecimal goodsValue) {
        this.goodsValue = goodsValue;
    }
}