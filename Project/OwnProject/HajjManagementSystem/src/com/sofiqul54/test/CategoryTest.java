/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54.test;

import com.sofiqul54.domain.Category;
import com.sofiqul54.service.CategoryService;

/**
 *
 * @author Md. Sofiqul Islam; J2EE (Round - 37); IDB-BISEW.
 */
public class CategoryTest {
    public static void main(String[] args) {
//        CategoryService.createTable();
       Category cat = new Category();
       cat.setName("Package B");
       cat.setPackagePrice(350000);
       
       CategoryService.insert(cat);
       
    }
    
}
