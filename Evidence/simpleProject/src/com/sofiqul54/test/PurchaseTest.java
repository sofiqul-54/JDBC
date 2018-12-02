
package com.sofiqul54.test;

import com.sofiqul54.service.PurchaseTableCreate;
import com.sofiqul54.domain.Purchases;

public class PurchaseTest {
    public static void main(String[] args) {
        //PurchaseTableCreate.createTable();
        
        Purchases p = new Purchases();
        p.setpCode(101);
        p.setpName("Mother Board");
        p.setQuantity(20);
        p.setUnitPrice(15000);
        p.setTotalPrice(300000);
        
        PurchaseTableCreate.insertDataToPurchase(p);
        
    }
}
