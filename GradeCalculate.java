package com.trustrace;

import java.util.Scanner;

public class GradeCalculate {
    static int average(int[] subjects) {
        int total = 0;
        for (int subject : subjects) {
            total = total + subject;
        }
        return total / subjects.length;
    }
    static void grade(int average) {
        if(average >= 80)
            System.out.println("The student Grade is: A");
        else if(average >= 60 && average < 80)
            System.out.println("The student Grade is: B");
        else if(average >= 40 && average < 60)
            System.out.println("The student Grade is: C");
        else
            System.out.println("The student Grade is: D");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the No of Subjects: ");
        int count = input.nextInt();
        int[] subjects = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter the Subject " + (i+1) + " mark: ");
            subjects[i] = input.nextInt();
        }
        grade(average(subjects));
    }
}
