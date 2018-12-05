package com.coderbd.test;

import com.coderbd.domain.User;
import com.coderbd.service.UserService;
import java.util.Date;

/**
 *
 * @author User
 */
public class UserTest {

    public static void main(String[] args) {
        //UserService.createTable();
        User user = new User("mehedee", "123", "salesman", "Mr.", "Mehedee", "mehedee@gmail.com", "01686239147", new Date(), true);
        UserService.insert(user);

        // User u = UserService.getUserbyUserName("admin", "123", true);
        // System.out.println(u);
    }
}
