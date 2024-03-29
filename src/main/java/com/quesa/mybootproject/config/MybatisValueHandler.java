package com.quesa.mybootproject.config;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 */
public class MybatisValueHandler implements TypeHandler<String> {

    @Override
    public void setParameter(PreparedStatement pstmt, int index, String value, JdbcType jdbcType) throws SQLException {
        if (value == "" && jdbcType == JdbcType.VARCHAR) {//判断传入的参数值是否为null
            pstmt.setString(index, null);//设置当前参数的值为空字符串
        } else {
            pstmt.setString(index, value);//如果不为null，则直接设置参数的值为value
        }
    }

    @Override
    public String getResult(ResultSet rs, String columnName) throws SQLException {
        return (rs.getString(columnName) == null) ? "" : rs.getString(columnName);
    }

    @Override
    public String getResult(ResultSet rs, int columnIndex) throws SQLException {
        return (rs.getString(columnIndex) == null) ? "" : rs.getString(columnIndex);
    }

    @Override
    public String getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return (cs.getString(columnIndex) == null) ? "" : cs.getString(columnIndex);
    }
}
