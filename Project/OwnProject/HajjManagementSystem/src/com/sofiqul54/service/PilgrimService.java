/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54.service;

import com.sofiqul54.connection.MySqlDbConnection;
import com.sofiqul54.domain.Pilgrim;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Md. Sofiqul Islam; J2EE (Round - 37); IDB-BISEW.
 */
public class PilgrimService {
    static Connection conn = MySqlDbConnection.getConnection();
    
    public static void createTable() {
        String sql = "create table pilgrim(id int auto_increment primary key, "
                + "account_no int not null, pilgrim_name varchar(30) not null, "
                + "father_name varchar(30) not null, mother_name varchar(30) not null, "
                + "date_of_birth date, "
                + "nid varchar (17) not null, passport_no varchar(7) not null, "
                + "passport_issue_date date, passport_expiry_date date, "
                + "present_address VARCHAR(150) not null, permanent_address VARCHAR(150) not null, mobile int(11) not null unique, "
                + "booking_date date, booking_money double, cat_id int, foreign key (cat_id) references category(id))";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Pilgrim Table has been created Succsessfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(PilgrimService.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public static void insert(Pilgrim pilgrim) {
        String sql = "insert into pilgrim(account_no, pilgrim_name, father_name, mother_name, date_of_birth, nid, passport_no, passport_issue_date, passport_expiry_date, present_address, permanent_address, mobile, booking_money, cat_id) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pilgrim.getAccNo());
            ps.setString(2, pilgrim.getPilgrimName());
            ps.setString(3, pilgrim.getFatherNamer());
            ps.setString(4, pilgrim.getMotherName());
           // ps.setBoolean(5, pilgrim.);
            ps.setDate(6, new java.sql.Date(pilgrim.getDoB().getTime()));        
            ps.setString(7, pilgrim.getNid());
            ps.setString(8, pilgrim.getPassportNo());            
            ps.setString(9, pilgrim.getAddress());           
            ps.setString(10, pilgrim.getMobile());
            ps.setDate(11, new java.sql.Date(pilgrim.getBookingDate().getTime()));
            ps.setDouble(12, pilgrim.getBookingMoney());
            ps.setInt(13, pilgrim.getCategory().getId());
            ps.executeUpdate();
            System.out.println("Data has been inserted to Pilgrim table Successfully!!");
            
        } catch (SQLException ex) {
            Logger.getLogger(PilgrimService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   

    
}
