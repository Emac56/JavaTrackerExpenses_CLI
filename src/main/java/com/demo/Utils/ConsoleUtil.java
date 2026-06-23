package com.demo.Utils;
import java.util.Scanner;

public class ConsoleUtil {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void clearScreen() {
    System.out.print("\u001B[2J");
    System.out.print("\u001B[H");
    System.out.flush();
    }
    
    public static void pause() {
    System.out.println("\nPress Enter to continue...");
    new java.util.Scanner(System.in).nextLine();
    }
}