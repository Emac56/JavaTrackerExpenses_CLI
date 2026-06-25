package com.demo.UI;
import com.demo.Utils.*;
import com.demo.UI.Actions.*;
public class SearchExpensesUI {
    
    public static void showHeader() {
        System.out.println();
        System.out.println("==========================");
        System.out.println("      SEARCH EXPENSES     ");
        System.out.println("==========================");
        System.out.println();
    }
    
    public static void showNoData() {
        showHeader();
        ConsoleUtil.noExpensesFoundBanner();
    }
    public static void menu() {
        
        boolean running = true;
        
        while(running) {
            ConsoleUtil.clearScreen();
            showHeader();
            System.out.println();
            System.out.println("1: Search by Name");
            System.out.println("2: Search by Category");
            System.out.println("3: Back");
            System.out.print("Select: ");
            int select = ConsoleUtil.input.nextInt();
            ConsoleUtil.input.nextLine();
            running = SearchExpensesAction.select(select);
        }
    }
    public static String getExpensesName() {
        System.out.print("Enter expenses name: ");
        return ConsoleUtil.input.nextLine();
    }
    public static String getCategoryName() {
        System.out.print("Enter category name: ");
        return ConsoleUtil.input.nextLine();
    }
    
}