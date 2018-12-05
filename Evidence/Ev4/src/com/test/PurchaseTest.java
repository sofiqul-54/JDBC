
package com.test;

import com.domain.Purchase;
import com.service.PurchaseService;
import com.service.SalesService;
import java.util.Date;

public class PurchaseTest {
    public static void main(String[] args) {
        //PurchaseService.createTable();
        //SalesService.createTable();
        
        Purchase p = new Purchase();
        p.setpName("Mobile");
        p.setCode("JL-2");
        p.setQuantity(5);
        p.setUnitPrice(12);
        p.setTotalPrice(60);
        p.setPurcaheDate(new Date());
        PurchaseService.insertTable(p);
    }
}
