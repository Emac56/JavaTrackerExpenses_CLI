package com.demo.UI.Actions;
import com.demo.Utils.*;
import com.demo.UI.*;
import com.demo.Controller.*;
import com.demo.Model.*;
import com.demo.Validations.*;

public class MainUIAction {
    static ExpensesModel expenses;
    public static boolean showUI(int option) {
        
        switch (option) {
            
            case 1:
            ConsoleUtil.clearScreen();
            AddExpensesUI.show();
            ConsoleUtil.pause();
            return true;
            
            case 2:
            ConsoleUtil.clearScreen();
            ViewExpensesAction.showExpenses();
            ConsoleUtil.pause();
            return true;
            
            case 3:
            ConsoleUtil.clearScreen();
            TotalExpensesAction.showTotalExpenses();
            ConsoleUtil.pause();
            return true;
            
            case 4:
            ConsoleUtil.clearScreen();
            return ExitValidation.confirm();
            
            default:
            System.out.println("Invalid option");
            ConsoleUtil.pause();
            return true;
        }
    }
}