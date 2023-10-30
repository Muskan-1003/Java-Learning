package com.muskan;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max);

        // optimize version for same
//        int max= Math.max(c,Math.max(a,b));
//        System.out.println(max);
//    Uppercase lowercase identifier
//        char ch= input.next().trim().charAt(0);
//        if ( ch >='a' && ch <='z'){
//            System.out.println("lowercase");
//        }else {
//            System.out.println("uppercase");
//        }
//Fiboonaci series
//        int n = input.nextInt();
//        int a=0;
//        int b=1;
//        int count=2;
//        while (count<=n){
//            int temp=b;
//            b=b+a;
//            a=temp;
//            count++;
//        }
//        System.out.println(b);
        // number counter
        int n = input.nextInt();
        int c = input.nextInt();//no to find
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == c) {
                count++;
            }
            n = n / 10;
        }

//        }
        System.out.println(count);

    }


 /* Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age=");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("you are eligible for Driving Licence and voting!! Congratulations..");
        } else {
            System.out.println("not an adult");
        }

    }   */

  //to reverse number
//       int num = 234577;
//       int ans = 0;
//        while (num > 0) {
//            int rem = num % 10;
//            ans = ans *10+ rem;
//            num = num / 10;
//        }
//        System.out.println(ans);
//    }
}


