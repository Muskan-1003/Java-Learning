import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        arrays of primitivies
//        int[] arr = new int[5];
//        arr[0]=223;
//        arr[1]=22;
//        arr[2]=423;
//        arr[3]=523;
//        arr[4]=33;
        // it will store it as [223, 22, 423, 523, 33]
//        System.out.println(arr[3]);
        //input using for loop
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i]= input.nextInt();

//    }
//        System.out.println(Arrays.toString(arr));
//        for (int arr: num) {
//            System.out.println(num + " ");
        // arrays for objects
        String[] str=new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=input.next();

        }
        System.out.println(Arrays.toString(str));

        }
    }


