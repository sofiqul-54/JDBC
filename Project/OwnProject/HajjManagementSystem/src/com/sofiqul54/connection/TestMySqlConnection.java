package com.sofiqul54.connection;

import java.sql.Connection;

/**
 *
 * @author Md. Sofiqul Islam; J2EE (Round - 37); IDB-BISEW.
 */
public class TestMySqlConnection {
    public static void main(String[] args) {
        Connection conn=MySqlDbConnection.getConnection();
    }
 
}
