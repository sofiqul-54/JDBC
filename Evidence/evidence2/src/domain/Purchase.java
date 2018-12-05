/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import connection.MySqlDbConnection;
import java.sql.Connection;
import java.util.Date;

/**
 *
 * @author User
 */
public class Purchase {
    private int id;
    private String name;
    private double price;
    private Date date;

    public Purchase() {
    }

    public Purchase(String name, double price, Date date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Purchase{" + "id=" + id + ", name=" + name + ", price=" + price + ", date=" + date + '}';
    }
    
    
}
