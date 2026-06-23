package com.demo.UI.Actions;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.demo.Controller.*;
import com.demo.Model.*;
import com.demo.UI.*;

public class TotalExpensesAction {

    public static void showTotalExpenses() {

        List<ExpensesModel> expenses =
                ExpensesController.getAllExpenses();

        if (expenses.isEmpty()) {

            TotalExpensesUI.showNoData();
            return;
        }

        Map<String, Double> categoryTotals =
                new HashMap<>();

        double grandTotal = 0;

        TotalExpensesUI.showHeader();
        for (ExpensesModel expense : expenses) {

            String category =
                    expense.getCategory();

            double amount =
                    expense.getAmount();

            categoryTotals.put(
                    category,
                    categoryTotals.getOrDefault(
                            category,
                            0.0
                    ) + amount
            );

            grandTotal += amount;
        }

        TotalExpensesUI.showData(
                categoryTotals,
                grandTotal
        );
    }
}