package com.trustrace;

import java.util.Scanner;

public class Overloading {
    static void area(float a) {
        System.out.println("Area of Square is " + (a * a));
    }
    static void area(float l, float b) {
        System.out.println("Area of Rectangle is " + (l * b));
    }
    static void area(double r) {
        System.out.println("Area of Circle is " + (3.14 * r));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side value for Square: ");
        area(input.nextFloat());
        System.out.print("Enter the length and breath values for Rectangle: ");
        area(input.nextFloat(), input.nextFloat());
        System.out.print("Enter the radius value for Circle: ");
        area(input.nextDouble());
    }
}
