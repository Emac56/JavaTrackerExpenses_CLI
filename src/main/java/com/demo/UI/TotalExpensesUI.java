package com.demo.UI;
import com.demo.Utils.*;
import com.demo.UI.Actions.*;
import java.util.Map;

public class TotalExpensesUI {
    public static void showNoData() {
        System.out.println("==========================");
        System.out.println("         TOTAL EXPENSES   ");
        System.out.println("==========================");
        System.out.println(" ");
        System.out.println("      No Expenses Found   ");
    }
    public static void showHeader() {
        System.out.println("==========================");
        System.out.println("      TOTAL EXPENSES");
        System.out.println("==========================");
        System.out.println();
        
    }
    public static void showData(
        Map<String, Double> categoryTotals,
        double grandTotal) {

    for (Map.Entry<String, Double> entry
            : categoryTotals.entrySet()) {

        System.out.println(
                entry.getKey()
                        + ": ₱"
                        + entry.getValue()
        );
    }

    System.out.println();
    System.out.println("--------------------------");
    System.out.println(
            "Grand Total: ₱"
                    + grandTotal
    );
    System.out.println("--------------------------");

    
}
    
}
