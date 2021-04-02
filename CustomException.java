package com.trustrace;

import java.util.Scanner;
import java.util.InputMismatchException;

class MyArithmeticException extends Exception {
    @Override
    public String toString() {
        return "/ by zero";
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter Dividend: ");
            int dividend = input.nextInt();
            System.out.print("Enter Divisor: ");
            int divisor = input.nextInt();
            if (divisor == 0)
                throw new MyArithmeticException();
            System.out.println("Answer: " + (dividend / divisor));
        }
        catch (MyArithmeticException e) {
            System.out.println("Exception: " + e);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect Input");
        }
    }
}
