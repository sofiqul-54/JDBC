/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import connection.MySqlDbConnection;

/**
 *
 * @author User
 */
public class ConnectionTest {
    public static void main(String[] args) {
        MySqlDbConnection.getConnection();
    }
}
