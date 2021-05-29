/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcreteBuilder;

import Builder.User_types;
import Entity.User;
import java.util.Scanner;

/**
 *
 * @author TechnoBoy
 */
public class NonResident implements User_types{

    User user = new User();
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void login() {
        System.out.print("Enter username : ");
        String username = sc.next();
        user.setUsername(username);
        
        System.out.print("Enter Password : ");
        String password = sc.next();
        user.setPassword(password);
    }

    @Override
    public boolean validator() {
        System.out.print("Enter your username to validate : ");
        String captcha = sc.next();
        return captcha.equalsIgnoreCase(user.getUsername());
    }

    @Override
    public User user() {
        return user;
    }
    
}
