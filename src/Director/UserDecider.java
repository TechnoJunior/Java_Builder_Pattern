/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Director;

import Builder.User_types;
import Entity.User;

/**
 *
 * @author TechnoBoy
 */
public class UserDecider {
    
    public User resident_user(User_types user_type){
        user_type.login();
        if(user_type.validator()){
            return user_type.user();
        }
        
        return null;
    }
    
    public User non_resident_user(User_types user_type){
        user_type.login();
        if(user_type.validator()){
            return user_type.user();
        }
        
        return null;
    }
}
