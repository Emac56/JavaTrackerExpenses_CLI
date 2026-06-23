package com.demo.UI;
import com.demo.Controller.*;
import com.demo.Utils.*;

public class AddExpensesUI {
    public static void show() {
        
        /*ADD EXPENSE BANNER*/
        System.out.println("==========================");
        System.out.println("         ADD EXPENSES      ");
        System.out.println("==========================");
        
        /*ADD EXPENSE MENU UI*/
         
        System.out.println("  ");
        System.out.print("Expense name: ");
        String expensesName = ConsoleUtil.input.nextLine();
        
        System.out.print("Category: ");
        String category = ConsoleUtil.input.nextLine();
        
        System.out.print("Amount: ");
        double amount = ConsoleUtil.input.nextDouble();
        
        System.out.println("  ");
        System.out.println(" [Expense Saved Successfully!");
        
        ExpensesController.addExpenses(expensesName,category,amount);
    }
    
}