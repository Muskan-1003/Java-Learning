import java.util.Scanner;

public class SubtractProductandSum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n= input.nextInt();
        System.out.println(productandsum(n));
    }
    public static int productandsum(int n){
        int sum =0;
        int prod=1;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n=n/10;
        }
        return prod - sum;

    }
}
