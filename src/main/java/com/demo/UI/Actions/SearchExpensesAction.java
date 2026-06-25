package com.demo.UI.Actions;
import com.demo.UI.*;
import com.demo.Utils.*;
import com.demo.Controller.*;
import com.demo.Model.*;
import java.util.List;

public class SearchExpensesAction {
    
    public static boolean select(int select) {
        
        switch (select) {
            case 1:
            ConsoleUtil.clearScreen();
            SearchExpensesUI.showHeader();
            searchByName();
            ConsoleUtil.pause();
            return true;
            
            case 2:
            ConsoleUtil.clearScreen();
            SearchExpensesUI.showHeader();
            searchByCategory();
            ConsoleUtil.pause();
            return true;
            
            case 3:
            MainUI.showMenu();
            return false;
            
            default:
            System.out.println("Invalid option! ");
            ConsoleUtil.pause();
            return true;
        }
    }
    public static void searchByName() {
        String expensesName = SearchExpensesUI.getExpensesName();
        
        List<ExpensesModel> results = 
        ExpensesController.searchByName(expensesName);
        
        if (results.isEmpty()) {
            SearchExpensesUI.showNoData();
            return;
            
        } else {
            for (ExpensesModel expense: results) {
                ViewExpensesUI.showData(expense);
            }
        }
    }
    public static void searchByCategory() {
        String category = SearchExpensesUI.getCategoryName();
        
        List<ExpensesModel> results = 
        ExpensesController.searchByCategory(category);
        
        if (results.isEmpty()) {
            SearchExpensesUI.showNoData();
            return;
            
        } else {
            for (ExpensesModel expense: results) {
                ViewExpensesUI.showData(expense);
            }
        }
    }
}