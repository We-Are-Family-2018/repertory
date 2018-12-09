package com.school.repertory.dao.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table supplier
 */
public class Supplier {
    /**
     * Database Column Remarks:
     *   供应商编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_no
     *
     * @mbg.generated
     */
    private String supplierNo;

    /**
     * Database Column Remarks:
     *   供应商名字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_name
     *
     * @mbg.generated
     */
    private String supplierName;

    /**
     * Database Column Remarks:
     *   供应商代表
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_person
     *
     * @mbg.generated
     */
    private String supplierPerson;

    /**
     * Database Column Remarks:
     *   供应商电话
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_telephone
     *
     * @mbg.generated
     */
    private String supplierTelephone;

    /**
     * Database Column Remarks:
     *   供应商邮件
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_email
     *
     * @mbg.generated
     */
    private String supplierEmail;

    /**
     * Database Column Remarks:
     *   供应商地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_address
     *
     * @mbg.generated
     */
    private String supplierAddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_no
     *
     * @return the value of supplier.supplier_no
     *
     * @mbg.generated
     */
    public String getSupplierNo() {
        return supplierNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_no
     *
     * @param supplierNo the value for supplier.supplier_no
     *
     * @mbg.generated
     */
    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo == null ? null : supplierNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_name
     *
     * @return the value of supplier.supplier_name
     *
     * @mbg.generated
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_name
     *
     * @param supplierName the value for supplier.supplier_name
     *
     * @mbg.generated
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_person
     *
     * @return the value of supplier.supplier_person
     *
     * @mbg.generated
     */
    public String getSupplierPerson() {
        return supplierPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_person
     *
     * @param supplierPerson the value for supplier.supplier_person
     *
     * @mbg.generated
     */
    public void setSupplierPerson(String supplierPerson) {
        this.supplierPerson = supplierPerson == null ? null : supplierPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_telephone
     *
     * @return the value of supplier.supplier_telephone
     *
     * @mbg.generated
     */
    public String getSupplierTelephone() {
        return supplierTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_telephone
     *
     * @param supplierTelephone the value for supplier.supplier_telephone
     *
     * @mbg.generated
     */
    public void setSupplierTelephone(String supplierTelephone) {
        this.supplierTelephone = supplierTelephone == null ? null : supplierTelephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_email
     *
     * @return the value of supplier.supplier_email
     *
     * @mbg.generated
     */
    public String getSupplierEmail() {
        return supplierEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_email
     *
     * @param supplierEmail the value for supplier.supplier_email
     *
     * @mbg.generated
     */
    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail == null ? null : supplierEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_address
     *
     * @return the value of supplier.supplier_address
     *
     * @mbg.generated
     */
    public String getSupplierAddress() {
        return supplierAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_address
     *
     * @param supplierAddress the value for supplier.supplier_address
     *
     * @mbg.generated
     */
    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress == null ? null : supplierAddress.trim();
    }
}