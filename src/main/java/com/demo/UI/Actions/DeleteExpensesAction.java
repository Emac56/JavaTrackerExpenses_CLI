package com.demo.UI.Actions;

import com.demo.Utils.*;
import com.demo.Controller.*;
import com.demo.UI.*;

public class DeleteExpensesAction {
    
    public static void confirmAndDelete() {
        ConsoleUtil.clearScreen();
        System.out.println("==========================");
        System.out.println("       DELETE EXPENSES     ");
        System.out.println("==========================");
        System.out.println();

        
        ViewExpensesAction.showExpenses(); 

        System.out.println("\n" + "=".repeat(30));
        
        if (ExpensesController.getAllExpenses().isEmpty()) {
            ConsoleUtil.pause();
            return;
        }

        System.out.print("Enter Expense ID to delete: ");
        int id = ConsoleUtil.input.nextInt();
        ConsoleUtil.input.nextLine(); 
        
        boolean exists = false;
        for (var expense : ExpensesController.getAllExpenses()) {
            if (expense.getId() == id) {
                exists = true;
                System.out.println("\nSelected Expense:");
                ViewExpensesUI.showData(expense);
                break;
            }
        }

        if (!exists) {
            System.out.println("X No expense found with ID " + id);
            ConsoleUtil.pause();
            return;
        }

        
        System.out.print("\nAre you sure you want to DELETE this expense? (yes/no): ");
        String confirm = ConsoleUtil.input.nextLine().trim().toLowerCase();

        if (confirm.equalsIgnoreCase("yes") || confirm.equalsIgnoreCase("y")) {
            boolean deleted = ExpensesController.deleteExpense(id);
            if (deleted) {
                System.out.println("√ Expense successfully deleted!");
            } else {
                System.out.println("X Failed to delete expense.");
            }
        } else {
            System.out.println("X Delete cancelled.");
        }
        
    }
}