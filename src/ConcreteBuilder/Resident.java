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
public class Resident implements User_types{
    
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
        System.out.print("Enter the lenght of your username to validate : ");
        String captcha = sc.next();
        return captcha.length() == user.getUsername().length();
    }

    @Override
    public User user() {
        return user;
    }
    
}
