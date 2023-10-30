package com.muskan;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number = ");
        int num= input.nextInt();
        long factorial= 1;
      // 1--->5
        for (int i = 1; i <=num; i++){
     //5--->1// for(int i=num;i>=1;i--){
            factorial=factorial*i;


        }
        System.out.println("the factorial of " + num + " is " + factorial );
    }
}
