package com.trustrace;

import java.util.Scanner;

public class BinarySearch {
    static void search(int[] array, int start, int end, int key) {
        int middle = (start + end)/2;
        while (start <= end) {
            if (array[middle] == key) {
                System.out.println("Found at Position " + (middle + 1));
                break;
            }
            else if (array[middle] < key)
                start = middle + 1;
            else
                end = middle - 1;
            middle = (start + end)/2;
        }
        if (start > end)
            System.out.println("Not found");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no.of Elements: ");
        int length = input.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the Elements in sorted order");
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            array[i] = input.nextInt();
        }
        System.out.print("Enter the Element for Search: ");
        int key = input.nextInt();
        search(array, 0, array.length - 1, key);
    }
}
