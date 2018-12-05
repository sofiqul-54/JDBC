package com.coderbd.test;

import com.coderbd.domain.Purchase;
import com.coderbd.domain.Sales;
import com.coderbd.domain.User;
import com.coderbd.service.SalesService;
import java.util.Date;

public class SalesTest {

    public static void main(String[] args) {
        //SalesService.createTable();
        Purchase p = new Purchase();
        p.setId(5);
        User u = new User();
        u.setId(3);

        Sales sales = new Sales("Toyota", "Premio", 2, 6000000, 12000000, new Date(), p, u);
        SalesService.insertForSales(sales);

    }
}
