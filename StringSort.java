package com.trustrace;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.print("Enter the size of the list: ");
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element " + (i + 1) + " : ");
            list.add(input.next());
        }
        list = list
                .stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println("Elements in Sorted order...");
        for (String s: list) {
            System.out.println(s);
        }
    }
}
