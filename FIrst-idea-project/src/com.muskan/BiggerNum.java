package com.muskan;

import java.util.Scanner;

public class BiggerNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        if(num1>num2){
            System.out.println(num1+" is bigger number");
        }
        else if ( num2>num1){
            System.out.println(num2+" is bigger number");
        }else{
            System.out.println("both the numbers are equal");
        }

    }
}
