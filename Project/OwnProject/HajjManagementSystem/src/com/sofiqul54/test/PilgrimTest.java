
package com.sofiqul54.test;

import com.sofiqul54.domain.Category;
import com.sofiqul54.service.PilgrimService;
import com.sofiqul54.domain.Pilgrim;

/**
 *
 * @author Md. Sofiqul Islam; J2EE (Round - 37); IDB-BISEW.
 */
public class PilgrimTest {
    public static void main(String[] args) {
       // PilgrimService.createTable();
        Pilgrim p = new Pilgrim();
        p.setAccNo(101);
        p.setPilgrimName("Mostafiz");
        p.setFatherNamer("Abdullah");
        p.setMotherName("Amina");
        p.setDoB("1990-Jan-08");
        p.setNid("2613869450144");
        p.setPassportNo("BR12345");        
        p.setAddress("Hasnabad");        
        p.setMobile("01748567000");
        p.setBookingMoney(50000);
        p.setCategory(1);
        
        PilgrimService.insert(p);
        
        
    }
   
}
