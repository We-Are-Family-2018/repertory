package com.school.repertory.dao.mapper;

import com.school.repertory.dao.model.SystemUser;
import com.school.repertory.dao.model.SystemUserExample.Criteria;
import com.school.repertory.dao.model.SystemUserExample.Criterion;
import com.school.repertory.dao.model.SystemUserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SystemUserSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    public String countByExample(SystemUserExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("system_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    public String deleteByExample(SystemUserExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("system_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    public String insertSelective(SystemUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("system_user");
        
        if (record.getUserUsername() != null) {
            sql.VALUES("user_username", "#{userUsername,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPassword() != null) {
            sql.VALUES("user_password", "#{userPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserFullname() != null) {
            sql.VALUES("user_fullname", "#{userFullname,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSex() != null) {
            sql.VALUES("user_sex", "#{userSex,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPhone() != null) {
            sql.VALUES("user_phone", "#{userPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAddress() != null) {
            sql.VALUES("user_address", "#{userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIsSuperAdmin() != null) {
            sql.VALUES("user_is_super_admin", "#{userIsSuperAdmin,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    public String selectByExample(SystemUserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("user_username");
        } else {
            sql.SELECT("user_username");
        }
        sql.SELECT("user_password");
        sql.SELECT("user_fullname");
        sql.SELECT("user_sex");
        sql.SELECT("user_phone");
        sql.SELECT("user_address");
        sql.SELECT("user_is_super_admin");
        sql.FROM("system_user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        SystemUser record = (SystemUser) parameter.get("record");
        SystemUserExample example = (SystemUserExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("system_user");
        
        if (record.getUserUsername() != null) {
            sql.SET("user_username = #{record.userUsername,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPassword() != null) {
            sql.SET("user_password = #{record.userPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserFullname() != null) {
            sql.SET("user_fullname = #{record.userFullname,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSex() != null) {
            sql.SET("user_sex = #{record.userSex,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPhone() != null) {
            sql.SET("user_phone = #{record.userPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAddress() != null) {
            sql.SET("user_address = #{record.userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIsSuperAdmin() != null) {
            sql.SET("user_is_super_admin = #{record.userIsSuperAdmin,jdbcType=BIT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("system_user");
        
        sql.SET("user_username = #{record.userUsername,jdbcType=VARCHAR}");
        sql.SET("user_password = #{record.userPassword,jdbcType=VARCHAR}");
        sql.SET("user_fullname = #{record.userFullname,jdbcType=VARCHAR}");
        sql.SET("user_sex = #{record.userSex,jdbcType=VARCHAR}");
        sql.SET("user_phone = #{record.userPhone,jdbcType=VARCHAR}");
        sql.SET("user_address = #{record.userAddress,jdbcType=VARCHAR}");
        sql.SET("user_is_super_admin = #{record.userIsSuperAdmin,jdbcType=BIT}");
        
        SystemUserExample example = (SystemUserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(SystemUser record) {
        SQL sql = new SQL();
        sql.UPDATE("system_user");
        
        if (record.getUserPassword() != null) {
            sql.SET("user_password = #{userPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserFullname() != null) {
            sql.SET("user_fullname = #{userFullname,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSex() != null) {
            sql.SET("user_sex = #{userSex,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPhone() != null) {
            sql.SET("user_phone = #{userPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAddress() != null) {
            sql.SET("user_address = #{userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIsSuperAdmin() != null) {
            sql.SET("user_is_super_admin = #{userIsSuperAdmin,jdbcType=BIT}");
        }
        
        sql.WHERE("user_username = #{userUsername,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, SystemUserExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}