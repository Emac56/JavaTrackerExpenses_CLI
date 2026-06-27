package com.demo.Controller;

import com.demo.Model.*;
import com.demo.Repository.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class ExpensesController {
    
    public static void addExpenses(String expensesName,String category,
    double amount) {
        
        int id =
    ExpensesRepository.generateId();
    
    LocalDateTime dateTime = LocalDateTime.now();
        
        ExpensesModel expense =
    new ExpensesModel(id, expensesName,category,amount,dateTime);
        ExpensesRepository.saveExpense(expense);
    }
    public static List<ExpensesModel> getAllExpenses() {
    return ExpensesRepository.getAllExpenses();
    }
    
    public static List<ExpensesModel> searchByName(String expenseName) {
        
        List<ExpensesModel> result = new ArrayList<>();
        
        for (ExpensesModel expense: getAllExpenses())
        {
            if (expense.getExpensesName().toLowerCase()
                .contains(expenseName.toLowerCase())){
                    
                    result.add(expense);
                }
        }
        return result;
    }
    
    public static List<ExpensesModel> searchByCategory(String category) {
        
        List<ExpensesModel> result = new ArrayList<>();
        
        for (ExpensesModel expense: getAllExpenses())
        {
            if (expense.getCategory().toLowerCase()
                .contains(category.toLowerCase())){
                    
                    result.add(expense);
                }
        }
        return result;
    }
    public static boolean deleteExpense(int id) {
    return ExpensesRepository.deleteExpense(id);
}
}