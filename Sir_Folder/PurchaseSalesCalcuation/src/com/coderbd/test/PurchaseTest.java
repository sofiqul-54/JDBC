/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.test;

import com.coderbd.domain.ProductCategory;
import com.coderbd.domain.Purchase;
import com.coderbd.domain.User;
import com.coderbd.service.PurchaseService;
import java.util.Date;

/**
 *
 * @author User
 */
public class PurchaseTest {

    public static void main(String[] args) {
        //PurchaseService.createTable();
        ProductCategory c = new ProductCategory();
        c.setId(1);
        User u = new User();
        u.setId(1);

        Purchase purchase = new Purchase("Toyota", "Premio", 2, 5000000, 10000000, new Date(), c, u);
        PurchaseService.insertMain(purchase);

//        List<Purchase> list = PurchaseService.getProductList();
//        for(Purchase p : list)
//        System.out.println(p);
    }
}
