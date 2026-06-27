package com.demo.Model;
import java.time.LocalDateTime;

public class ExpensesModel {
    
    private int id;
    private String expensesName;
    private String category;
    private double amount;
    private LocalDateTime expensesDate;
    
    public ExpensesModel(int id, String expensesName,
    String category, double amount, LocalDateTime expensesDate) {
        
        this.id = id;
        this.expensesName = expensesName;
        this.category = category;
        this.amount = amount;
        this.expensesDate = expensesDate;
    }
    public ExpensesModel(String expensesName,
    String category, double amount) {
        
        this.expensesName = expensesName;
        this.category = category;
        this.amount = amount;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    
    public String getExpensesName() {return expensesName;}
    public void setExpensesName(String expensesName) {this.expensesName = expensesName;}
    
    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}
    
    public double getAmount() {return amount;}
    public void setAmount(double amount) {this.amount = amount;}
    
    public LocalDateTime getExpensesDate() {return expensesDate;}
    public void setExpensesDate(LocalDateTime expensesDate) {this.expensesDate = expensesDate;}
}