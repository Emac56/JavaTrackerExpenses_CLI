package com.demo.Controller;

import com.demo.Model.*;
import com.demo.Repository.*;
import java.time.LocalDateTime;
import java.util.List;

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
    
} 