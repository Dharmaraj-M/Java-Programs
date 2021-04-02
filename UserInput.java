package com.trustrace;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter Input for Integer: ");
            int intNum = input.nextInt();
            System.out.print("Enter Input for Float: ");
            float floatNum = input.nextFloat();
            System.out.print("Enter Input for String: ");
            String string = input.next();
            System.out.println("Integer: " + intNum);
            System.out.println("Float: " + floatNum);
            System.out.println("String: " + string);
        }
        catch (ArithmeticException e) {
            System.out.println("Check your Input");
        }
    }
}
