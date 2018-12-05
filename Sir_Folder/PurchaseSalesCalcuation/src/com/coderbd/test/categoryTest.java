package com.coderbd.test;

import com.coderbd.domain.ProductCategory;
import com.coderbd.service.ProductCategoryService;

/**
 *
 * @author User
 */
public class categoryTest {

    public static void main(String[] args) {
        //ProductCategoryService.createTable();
        ProductCategory cat=new ProductCategory();
        cat.setName("Car");
        
        ProductCategoryService.insert(cat);

    }
}
