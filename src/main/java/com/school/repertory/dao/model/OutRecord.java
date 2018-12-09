package com.school.repertory.dao.model;

import java.time.LocalDateTime;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table out_record
 */
public class OutRecord {
    /**
     * Database Column Remarks:
     *   出库记录id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_record.out_record_id
     *
     * @mbg.generated
     */
    private Integer outRecordId;

    /**
     * Database Column Remarks:
     *   客户编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_record.out_record_customer_no
     *
     * @mbg.generated
     */
    private String outRecordCustomerNo;

    /**
     * Database Column Remarks:
     *   货物编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_record.out_record_goods_no
     *
     * @mbg.generated
     */
    private String outRecordGoodsNo;

    /**
     * Database Column Remarks:
     *   出库数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_record.out_record_count
     *
     * @mbg.generated
     */
    private Integer outRecordCount;

    /**
     * Database Column Remarks:
     *   出库时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_record.out_record_dt
     *
     * @mbg.generated
     */
    private LocalDateTime outRecordDt;

    /**
     * Database Column Remarks:
     *   出库经手人编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_record.out_record_person_no
     *
     * @mbg.generated
     */
    private String outRecordPersonNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_record.out_record_id
     *
     * @return the value of out_record.out_record_id
     *
     * @mbg.generated
     */
    public Integer getOutRecordId() {
        return outRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_record.out_record_id
     *
     * @param outRecordId the value for out_record.out_record_id
     *
     * @mbg.generated
     */
    public void setOutRecordId(Integer outRecordId) {
        this.outRecordId = outRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_record.out_record_customer_no
     *
     * @return the value of out_record.out_record_customer_no
     *
     * @mbg.generated
     */
    public String getOutRecordCustomerNo() {
        return outRecordCustomerNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_record.out_record_customer_no
     *
     * @param outRecordCustomerNo the value for out_record.out_record_customer_no
     *
     * @mbg.generated
     */
    public void setOutRecordCustomerNo(String outRecordCustomerNo) {
        this.outRecordCustomerNo = outRecordCustomerNo == null ? null : outRecordCustomerNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_record.out_record_goods_no
     *
     * @return the value of out_record.out_record_goods_no
     *
     * @mbg.generated
     */
    public String getOutRecordGoodsNo() {
        return outRecordGoodsNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_record.out_record_goods_no
     *
     * @param outRecordGoodsNo the value for out_record.out_record_goods_no
     *
     * @mbg.generated
     */
    public void setOutRecordGoodsNo(String outRecordGoodsNo) {
        this.outRecordGoodsNo = outRecordGoodsNo == null ? null : outRecordGoodsNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_record.out_record_count
     *
     * @return the value of out_record.out_record_count
     *
     * @mbg.generated
     */
    public Integer getOutRecordCount() {
        return outRecordCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_record.out_record_count
     *
     * @param outRecordCount the value for out_record.out_record_count
     *
     * @mbg.generated
     */
    public void setOutRecordCount(Integer outRecordCount) {
        this.outRecordCount = outRecordCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_record.out_record_dt
     *
     * @return the value of out_record.out_record_dt
     *
     * @mbg.generated
     */
    public LocalDateTime getOutRecordDt() {
        return outRecordDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_record.out_record_dt
     *
     * @param outRecordDt the value for out_record.out_record_dt
     *
     * @mbg.generated
     */
    public void setOutRecordDt(LocalDateTime outRecordDt) {
        this.outRecordDt = outRecordDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_record.out_record_person_no
     *
     * @return the value of out_record.out_record_person_no
     *
     * @mbg.generated
     */
    public String getOutRecordPersonNo() {
        return outRecordPersonNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_record.out_record_person_no
     *
     * @param outRecordPersonNo the value for out_record.out_record_person_no
     *
     * @mbg.generated
     */
    public void setOutRecordPersonNo(String outRecordPersonNo) {
        this.outRecordPersonNo = outRecordPersonNo == null ? null : outRecordPersonNo.trim();
    }
}