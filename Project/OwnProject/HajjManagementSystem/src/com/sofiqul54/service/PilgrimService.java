/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54.service;

import com.sofiqul54.connection.MySqlDbConnection;
import java.sql.Connection;

/**
 *
 * @author Md. Sofiqul Islam; J2EE (Round - 37); IDB-BISEW.
 */
public class PilgrimService {
    static Connection conn = MySqlDbConnection.getConnection();
    
    String sql = "create table pilgrim(id int auto_increment primary key, account_no int not null, pilgrim_name varchar(30) not null, father_name varchar(30) not null, mother_name varchar(30) not null, )";
}
