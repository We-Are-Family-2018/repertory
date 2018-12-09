package com.school.repertory.dao.model;

import java.time.LocalDateTime;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table access_log
 */
public class AccessLog {
    /**
     * Database Column Remarks:
     *   操作id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access_log.access_id
     *
     * @mbg.generated
     */
    private Integer accessId;

    /**
     * Database Column Remarks:
     *   用户名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access_log.access_username
     *
     * @mbg.generated
     */
    private String accessUsername;

    /**
     * Database Column Remarks:
     *   用户操作
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access_log.access_action
     *
     * @mbg.generated
     */
    private String accessAction;

    /**
     * Database Column Remarks:
     *   操作时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access_log.access_dt
     *
     * @mbg.generated
     */
    private LocalDateTime accessDt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access_log.access_id
     *
     * @return the value of access_log.access_id
     *
     * @mbg.generated
     */
    public Integer getAccessId() {
        return accessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access_log.access_id
     *
     * @param accessId the value for access_log.access_id
     *
     * @mbg.generated
     */
    public void setAccessId(Integer accessId) {
        this.accessId = accessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access_log.access_username
     *
     * @return the value of access_log.access_username
     *
     * @mbg.generated
     */
    public String getAccessUsername() {
        return accessUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access_log.access_username
     *
     * @param accessUsername the value for access_log.access_username
     *
     * @mbg.generated
     */
    public void setAccessUsername(String accessUsername) {
        this.accessUsername = accessUsername == null ? null : accessUsername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access_log.access_action
     *
     * @return the value of access_log.access_action
     *
     * @mbg.generated
     */
    public String getAccessAction() {
        return accessAction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access_log.access_action
     *
     * @param accessAction the value for access_log.access_action
     *
     * @mbg.generated
     */
    public void setAccessAction(String accessAction) {
        this.accessAction = accessAction == null ? null : accessAction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access_log.access_dt
     *
     * @return the value of access_log.access_dt
     *
     * @mbg.generated
     */
    public LocalDateTime getAccessDt() {
        return accessDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access_log.access_dt
     *
     * @param accessDt the value for access_log.access_dt
     *
     * @mbg.generated
     */
    public void setAccessDt(LocalDateTime accessDt) {
        this.accessDt = accessDt;
    }
}