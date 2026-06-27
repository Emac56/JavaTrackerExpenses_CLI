package com.demo.Repository;

import com.demo.Model.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class ExpensesRepository {

    private static final String DATA_PATH = "src/main/resources/Data/expenses.txt";

    public static void saveExpense(ExpensesModel expenses) {
        try {
            String data = expenses.getId() + "," +
                          expenses.getExpensesName() + "," +
                          expenses.getCategory() + "," +
                          expenses.getAmount() + "," +
                          expenses.getExpensesDate();

            BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_PATH, true));
            writer.write(data);
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            System.out.println("Error saving expenses: " + e.getMessage());
        }
    }

    public static int generateId() {
        int lastId = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 0) {
                    lastId = Integer.parseInt(data[0]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lastId + 1;
    }
    
    public static List<ExpensesModel> getAllExpenses() {
        List<ExpensesModel> expenses = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 5) continue; // skip invalid lines

                int id = Integer.parseInt(data[0]);
                String expensesName = data[1];
                String category = data[2];
                double amount = Double.parseDouble(data[3]);
                LocalDateTime expensesDate = LocalDateTime.parse(data[4]);

                ExpensesModel expense = new ExpensesModel(id, expensesName, category, amount, expensesDate);
                expenses.add(expense);
            }
        } catch (IOException e) {
            System.out.println("Error reading expenses: " + e.getMessage());
        }
        return expenses;
    }

    // ✅ DELETE METHOD - Nas a tamang lugar na
    public static boolean deleteExpense(int id) {
        List<ExpensesModel> expenses = getAllExpenses();
        boolean found = false;
        List<ExpensesModel> updatedList = new ArrayList<>();

        for (ExpensesModel expense : expenses) {
            if (expense.getId() == id) {
                found = true;
                continue; // i-delete
            }
            updatedList.add(expense);
        }

        if (found) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_PATH))) {
                for (ExpensesModel exp : updatedList) {
                    String data = exp.getId() + "," +
                                 exp.getExpensesName() + "," +
                                 exp.getCategory() + "," +
                                 exp.getAmount() + "," +
                                 exp.getExpensesDate();
                    writer.write(data);
                    writer.newLine();
                }
                return true;
            } catch (IOException e) {
                System.out.println("Error deleting expense: " + e.getMessage());
            }
        }
        return false;
    }
}