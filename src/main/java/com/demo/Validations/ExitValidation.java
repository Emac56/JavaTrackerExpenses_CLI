package com.demo.Validations;
import com.demo.Utils.*;

public class ExitValidation {
    
    public static boolean confirm() {
        
        System.out.print("Are you sure you want to exit?: ");
        String exit = ConsoleUtil.input.nextLine();
            
        if (exit.equalsIgnoreCase("yes")) {
            System.out.println("System exiting...");
            System.out.println("Thank you user! and goodbye.");
            return false;
        } else {
            return true;
        }
    }
    
}