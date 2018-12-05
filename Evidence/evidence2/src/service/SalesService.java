/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import connection.MySqlDbConnection;
import domain.Purchase;
import domain.Sales;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static service.SalesService.conn;

/**
 *
 * @author User
 */
public class SalesService {
    
    static Connection conn = MySqlDbConnection.getConnection();
    
    public static void createTable() {
        String sql = "create table sales(id int auto_increment primary key, name varchar(30), price double, date Date, pid int(11), foreign key (pid) references purchase(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Table created!");
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void insert(Sales s) {
        String sql = "insert into sales(name,price,date,pid) values(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setDouble(2, s.getPrice());
            ps.setDate(3, new java.sql.Date(s.getDate().getTime()));
            ps.setInt(4, s.getP().getId());
            ps.executeUpdate();
            System.out.println("Data Inserted!");
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void update(Sales s) {
        String sql = "update sales set name = ?, price = ?, pid =? where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setDouble(2, s.getPrice());
            
//            Purchase pur=new Purchase();
//            ps.setInt(3, pur.getId());

            ps.setInt(3, s.getP().getId());
            ps.setInt(4, s.getId());
            
            ps.executeUpdate();
            System.out.println("Data Updated!");
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void delete(Sales s) {
        String sql = "delete from sales where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getId());
            ps.executeUpdate();
            System.out.println("data deleted");
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List<Sales> getSalesTable() {
        List<Sales> list = new ArrayList<>();
        String sql = "select id, name, price, date, pid from sales";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Sales s = new Sales();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setPrice(rs.getDouble(3));
                s.setDate(rs.getDate(4));
                Purchase p = new Purchase();
                p.setId(rs.getInt(5));
                s.setP(p);
                
                list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
