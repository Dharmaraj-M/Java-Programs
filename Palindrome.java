package com.trustrace;

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String s, int start, int end) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(start) != s.charAt(end))
            return false;
        if(start < end)
            return isPalindrome(s, start + 1, end - 1);
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = input.next();
        boolean check = isPalindrome(s, 0, s.length() - 1);
        System.out.println(check ? "Given String is Palindrome" : "Given String is not Palindrome");
    }
}
