package com.glbank.com.sg.bdd.utils;

import java.sql.*;

public class updateUEN {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://10.50.7.210:3306/yourDatabaseName";
        String username = "mumu";
        String password = "123456";

        try {
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to MySQL database!");
            Statement stmt = conn.createStatement();
            String sql = "select * from abc where a = 1";
//            查询数据
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String b = rs.getString("b");
                rs.updateString("b", b + "1");
            }
//            修改数据
            String UpdateSql = "update abc set b = '11' where a = 1";
            stmt.executeUpdate(UpdateSql);
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error connecting to MySQL database");
            e.printStackTrace();
        }
    }
}
