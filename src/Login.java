
import ConcreteBuilder.NonResident;
import ConcreteBuilder.Resident;
import Director.UserDecider;
import Entity.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TechnoBoy
 */
public class Login {
    public static void main(String args[]){
        Resident new_Resident = new Resident();
        UserDecider decider = new UserDecider();
        
        User user = decider.resident_user(new_Resident);
        if(user != null){
            System.out.println("Welcome "+user.getUsername());
        }else{
            System.err.println("Unable to log you in ");
        }
        
        
        NonResident new_nonResident = new NonResident();
        UserDecider decider1 = new UserDecider();
        
        User non_user = decider1.non_resident_user(new_nonResident);
        if(non_user != null){
            System.out.println("Welcome "+non_user.getUsername());
        }else{
            System.err.println("Unable to log you in");
        }
    }
}