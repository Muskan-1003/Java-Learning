import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ans=sum();
        System.out.println(ans);
    }
//  access_modifier static return_type name(){
      //body
    //return
    //}
    static Integer sum(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1= input.nextInt();
        System.out.println("Enter number 2");
        int num2= input.nextInt();
        int sum=num1+num2;
        return sum;




    }

}