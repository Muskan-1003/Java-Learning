import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
//        int[][] arr =new int[3][];
        //or
//        int[][] arr={
//            {1,2,3},//0th index
//            {2,4,6},//1st index
//            {3,7,9}//2nd index
//
//        };
        Scanner input=new Scanner(System.in);
//        int n=3,m=3;
        //input
//        for (int i = 0; i < n ; i++) {}

        int[][] arr=new int[3][3];
//        System.out.println(arr.length);
//        System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                arr[row][col]=input.nextInt();

            }

        }
        //output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {

                System.out.print(arr[row][col] + " ");

            }
            System.out.println();

        }
        // enhanced for loop
//         for (int[] a : arr){
//             System.out.println(Arrays.toString(a));
//         }






    }
}
