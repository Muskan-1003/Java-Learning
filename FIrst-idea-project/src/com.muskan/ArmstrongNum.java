package com.muskan;

public class ArmstrongNum {
    public static void main(String[] args) {


        //armstrong number is  if
        // abcd=a^n+b^n+c^n+d^n
        // where n=no. of digits
        //so in this case abcd=a^4+b^4+c^4+d^4
        int num = 1634;
        int temp = num;
        int p = 0;
        while (num > 0) {
            int rem = num % 10;
            p = p + (rem * rem * rem * rem);
            num = num / 10;
        }
        if (p == temp) {
            System.out.println(p + " given no. is an armstrong number");
        } else {
            System.out.println(p + "given no. is not an armstrong number");
        }
    }
}


