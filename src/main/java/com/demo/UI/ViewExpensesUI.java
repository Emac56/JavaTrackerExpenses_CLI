package com.demo.UI;

import com.demo.Utils.*;
import com.demo.Model.*;

public class ViewExpensesUI {
    
    public static void showHeader() {
        System.out.println("==========================");
        System.out.println("         VIEW EXPENSES      ");
        System.out.println("==========================");
        System.out.println(" ");
    }
    public static void showNoData() {
        showHeader();
        System.out.println("      No Expenses Found   ");
        
    }
    
    public static void showData(
        ExpensesModel expense) {
            
            System.out.println();
    System.out.println("ID: " + expense.getId());
    System.out.println("Expense Name: " +
            expense.getExpensesName());

    System.out.println("Category: " +
            expense.getCategory());

    System.out.println("Amount: " +
            expense.getAmount());

    System.out.println("Date: " +
            expense.getExpensesDate());

    System.out.println("--------------------------");
}
    
}