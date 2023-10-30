package com.muskan;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int p= input.nextInt();
        int t= input.nextInt();
        int r= input.nextInt();
        int S=((p*r*t)/100);
        System.out.println("The simple interest for given number is= " + S);


    }
}
