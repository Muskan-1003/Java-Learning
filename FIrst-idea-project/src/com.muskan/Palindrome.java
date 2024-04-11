package com.muskan;

import java.util.Scanner;

public class xPalindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please provide string :");
        String str= input.next();
        String org_str=str;
        String rev="";
        int len=str.length();
        for (int i = len-1; i >=0 ; i--) {
            rev =rev+str.charAt(i);

        }
        if (org_str.equals(rev)){
            System.out.println(org_str+ " is a palindrome");

        }else {
            System.out.println(org_str + " is not a palindrome");
        }
///best solution

//        class Solution {
//            int isPalindrome(String S) {
//                int len = S.length();
//                for (int i = 0; i < len / 2; i++) {
//                    // Compare characters from the start and end of the string
//                    if (S.charAt(i) != S.charAt(len - 1 - i)) {
//                        return 0; // Not a palindrome
//                    }
//                }
//                return 1; // Palindrome
//            }
//        }


    }
}
