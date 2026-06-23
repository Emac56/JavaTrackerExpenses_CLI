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

            String data =
                    expenses.getId() + "," +
                    expenses.getExpensesName() + "," +
                    expenses.getCategory() + "," +
                    expenses.getAmount() + "," +
                    expenses.getExpensesDate();

            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(DATA_PATH, true));

            writer.write(data);
            writer.newLine();

            writer.close();

        } catch (IOException e) {

            System.out.println("Error saving expenses: "
                    + e.getMessage());

        }

    }
    public static int generateId() {

    int lastId = 0;

    try (
        BufferedReader reader =
                new BufferedReader(
                        new FileReader(DATA_PATH))
    ) {

        String line;

        while ((line = reader.readLine()) != null) {

            String[] data = line.split(",");

            lastId = Integer.parseInt(data[0]);
        }

    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }

    return lastId + 1;
    }
    
public static List<ExpensesModel> getAllExpenses() {

    List<ExpensesModel> expenses =
            new ArrayList<>();

    try {

        BufferedReader reader =
                new BufferedReader(
                        new FileReader(DATA_PATH));

        String line;

        while ((line = reader.readLine()) != null) {

            String[] data = line.split(",");

            int id =
                    Integer.parseInt(data[0]);

            String expensesName =
                    data[1];

            String category =
                    data[2];

            double amount =
                    Double.parseDouble(data[3]);

            LocalDateTime expensesDate =
                    LocalDateTime.parse(data[4]);

            ExpensesModel expense =
                    new ExpensesModel(
                            id,
                            expensesName,
                            category,
                            amount,
                            expensesDate
                    );

            expenses.add(expense);
        }

        reader.close();

    } catch (IOException e) {

        System.out.println(
                "Error reading expenses: "
                        + e.getMessage());

    }

    return expenses;
}
}