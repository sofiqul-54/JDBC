package com.sofiqul54.service;

import com.sofiqul54.connection.MySqlDbConnection;
import com.sofiqul54.domain.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Md. Sofiqul Islam; J2EE (Round - 37); IDB-BISEW.
 */
public class CategoryService {

    static Connection conn = MySqlDbConnection.getConnection();
    
    public static void createTable() {
        String sql = "create table category(id int auto_increment primary key, name varchar(30)not null, package_price double not null)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Category Table has been created Succsessfully!! ");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void insert(Category cat){
    String sql = "insert into category(name, package_price) values(?,?)";
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cat.getName());
            ps.setDouble(2, cat.getPackagePrice());
            ps.executeUpdate();
            System.out.println("Data has been inserted into Category Table Successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     public static List<Category> getCatList() {
        List<Category> list = new ArrayList<>();

        String sql = "select * from category";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category pc = new Category();
                pc.setId(rs.getInt(1));
                pc.setName(rs.getString(2));
                list.add(pc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
