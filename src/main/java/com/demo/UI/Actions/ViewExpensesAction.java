package com.demo.UI.Actions;

import java.util.List;

import com.demo.Controller.*;
import com.demo.Model.*;
import com.demo.UI.*;

public class ViewExpensesAction {

    public static void showExpenses() {

        List<ExpensesModel> expenses =
                ExpensesController.getAllExpenses();

        if (expenses.isEmpty()) {

            ViewExpensesUI.showNoData();

        } else {

            ViewExpensesUI.showHeader();
            for (ExpensesModel expense : expenses) {

                ViewExpensesUI.showData(expense);

            }

        }

    }

}