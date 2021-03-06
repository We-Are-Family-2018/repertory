package com.school.repertory.dao.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table goods_storage
 */
public class GoodsStorage {
    /**
     * Database Column Remarks:
     *   库存货物编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_storage.storage_goods_no
     *
     * @mbg.generated
     */
    private String storageGoodsNo;

    /**
     * Database Column Remarks:
     *   库存数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_storage.storage_count
     *
     * @mbg.generated
     */
    private Integer storageCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_storage.storage_goods_no
     *
     * @return the value of goods_storage.storage_goods_no
     *
     * @mbg.generated
     */
    public String getStorageGoodsNo() {
        return storageGoodsNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_storage.storage_goods_no
     *
     * @param storageGoodsNo the value for goods_storage.storage_goods_no
     *
     * @mbg.generated
     */
    public void setStorageGoodsNo(String storageGoodsNo) {
        this.storageGoodsNo = storageGoodsNo == null ? null : storageGoodsNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_storage.storage_count
     *
     * @return the value of goods_storage.storage_count
     *
     * @mbg.generated
     */
    public Integer getStorageCount() {
        return storageCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_storage.storage_count
     *
     * @param storageCount the value for goods_storage.storage_count
     *
     * @mbg.generated
     */
    public void setStorageCount(Integer storageCount) {
        this.storageCount = storageCount;
    }
}