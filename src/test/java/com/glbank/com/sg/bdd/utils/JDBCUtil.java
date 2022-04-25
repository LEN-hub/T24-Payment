package com.glbank.com.sg.bdd.utils;

import org.apache.commons.lang3.StringUtils;

import java.sql.*;


public class JDBCUtil {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://10.24.8.233:3311/glbank_cust?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    // 数据库的用户名与密码，需要根据自己的设置
    private static final String USER = "dctest";
    private static final String PASS = "P@ssw0rd_123";

    public static void main(String[] args) {
        int result = updateAmlResult(1,"companyData");
        if(result > 0){
            System.out.println("更新成功");
        }
    }

    private static int updateAmlResult(int amlResult, String name){
        Object[] updateParams = new Object[]{amlResult, FileUtils.LastReadFileInput3(name)};
        return updateQuery("update cust_aml_info a set a.aml_result = ? where a.name = ?;", updateParams);
    }

    private static Connection getConnection(){
        Connection conn = null;
        try {
           // 注册 JDBC 驱动
           Class.forName(JDBC_DRIVER);
           // 打开链接
           System.out.println("连接数据库...");
           conn = DriverManager.getConnection(DB_URL,USER,PASS);
       }catch (Exception e){
           e.printStackTrace();
           System.out.println("连接失败：" + e.getMessage());
       }
        if(conn == null){
            throw new RuntimeException("获取连接失败");
        }
       return conn;
    }

    private static boolean checkSqlParams(String sql, Object... fields){
        boolean checked = false;
        if(StringUtils.isNotBlank(sql) && fields != null){
            int count = 0;
            char[] chars = sql.toCharArray();
            for (char aChar : chars) {
                if(aChar == 63){
                    count ++;
                }
            }
            if(count == fields.length){
                checked = true;
            }
        }
        if(!checked){
            throw new RuntimeException("参数错误");
        }
        return checked;
    }

    private static void setParams(PreparedStatement stmt, Object... fields){
        try {
            for (int i = 0; i < fields.length; i++) {
                if(fields[i] instanceof String){
                    stmt.setString(i + 1, (String)fields[i]);
                }else if(fields[i] instanceof Integer){
                    stmt.setInt(i + 1, (int)fields[i]);
                }
            }
        }catch (Exception e){
            throw new RuntimeException("赋值失败：" + e.getMessage());
        }
    }

    private static int updateQuery(String sql, Object... fields){
        checkSqlParams(sql, fields);
        Connection conn = getConnection();
        PreparedStatement stmt = null;
        int result = -1;
        try {
            stmt = conn.prepareStatement(sql);
            setParams(stmt, fields);
            result = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection(conn, stmt);
        }
        return result;
    }


    private static void closeConnection(Connection conn, PreparedStatement stmt){
        // 关闭资源
        try {
            if(stmt!=null) {
                stmt.close();
            }
            if(conn!=null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

