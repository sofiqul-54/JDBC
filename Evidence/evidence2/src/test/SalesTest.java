/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Purchase;
import domain.Sales;
import java.util.Date;
import service.SalesService;

/**
 *
 * @author User
 */
public class SalesTest {
    
    public static void main(String[] args) {
        //SalesService.createTable();
        Purchase p = new Purchase();
        p.setId(1);
        Sales s = new Sales("htc mobile", 16000, new Date(), p);
        SalesService.insert(s);
    }
}
