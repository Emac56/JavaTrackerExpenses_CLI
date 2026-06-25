package com.demo.UI;

import java.util.Scanner;
import com.demo.Utils.*;
import com.demo.UI.Actions.*;

public class MainUI {
    
    public static void showMenu() {
        
        /*WELCOME UI*/
        
        boolean running = true;
        
        while (running) {
            
            ConsoleUtil.clearScreen();
            System.out.println("==========================");
            System.out.println("        WELCOME TO"        );
            System.out.println("HOUSEHOLD EXPENSE TRACKER!");
            System.out.println("   MADE BY: EMAC VICENTE"  );
            System.out.println("==========================");
        
            /*MAIN MENU UI*/
            System.out.println("  ");
            System.out.println("1: Add Expenses");
            System.out.println("2: View Expenses");
            System.out.println("3: Total Expenses");
            System.out.println("4: Search Expenses");
            System.out.println("5: Exit");
            System.out.println(" ");
            System.out.print("Select option: ");
            int option = ConsoleUtil.input.nextInt();
            ConsoleUtil.input.nextLine();
            running = MainUIAction.showUI(option);
            
        }
    }
}