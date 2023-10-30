package com.muskan;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the side of cube = ");
        double a= input.nextDouble();
        double t=(6*a*a);
        System.out.println("Total surface area of cube side " + a + "is" +" " + t);
    }
}
