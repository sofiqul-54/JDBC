package com.sofiqul54.test;

import com.sofiqul54.domain.Catagory;
import com.sofiqul54.domain.Product;
import com.sofiqul54.serviceCreate.CreateCatagoryTable;
import com.sofiqul54.serviceCreate.CreateProductTable;
import com.sofiqul54.serviceInsert.InsertDataToCatagoryTable;
import com.sofiqul54.serviceInsert.InsertDataToProductTable;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        //test create table create
        // CreateCatagoryTable.createTable();
//        Catagory c = new Catagory();
//        c.setName("By-Cycle");
//        InsertDataToCatagoryTable.insertData(c);
        // CreateProductTable.createTable();

        ///////////insert data
        //Catagory c = new Catagory(1, "Mobile");
//        Catagory c = new Catagory(1, "Laptop");
//        Catagory c = new Catagory(1, "Motor-Cycle");
//        InsertDataToCatagoryTable.insertData(c);
        Product p = new Product();
        p.setName("Nokia 454");
        p.setQuantity(2);
        p.setUnitPrice(2000);
        p.setTotalPrice(4000);
        p.setPurchaseDate(new Date());
        Catagory c = new Catagory();
        c.setId(1);
        p.setCatagory(c);        
        InsertDataToProductTable.insertDataProduct(p);

    }

}
