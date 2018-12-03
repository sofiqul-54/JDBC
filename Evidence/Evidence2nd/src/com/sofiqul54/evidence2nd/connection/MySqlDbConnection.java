
package com.sofiqul54.evidence2nd.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDbConnection {
private static final String HOST = "jdbc:mysql://localhost:3306";
private static final String DBNAME = "evidence2";
private static final String URL = HOST + "/" + DBNAME;
private static Connection con = null;

public static Connection getConnection(){

    try {
        con = DriverManager.getConnection(URL, "root", "1234");
        System.out.println("::Connected::");
    } catch (Exception e) {
    }
    return con;
}
    
}
