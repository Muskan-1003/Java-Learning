package com.muskan;

import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str=input.next();
        String rev=" ";
//        int len=str.length();//will tell the length of the string
//        for (int i = len -1; i >=0 ; --i) {// e.g abcd so length=4 here initilization is from len-1
//            rev=rev + str.charAt(i);        // means 4-1=3 due to index numbering so i will iterate till 0
//                                             // --i is because abcd --->dcba
//                                            // for D =3 here str.charAt(3)=D therefore rev=D
//        }                                   // for next iteration D+charAt(2)-->c
//        System.out.println(rev);
        //using character array
       char a[]=str.toCharArray();
       int len=a.length;
        for (int i = len-1; i >=0; i--) {
              rev =rev+ a[i];


        }
        System.out.println(rev);


    }

}
