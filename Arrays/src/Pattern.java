public class Pattern {
    public static void main(String[] args) {
//        pattern1(4);
        pattern9(5);

    }
    static void pattern1 (int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }
    static void pattern2 (int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }
    static void pattern3 (int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }

    static void pattern4 (int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();


        }
    }


    static void pattern6 (int n){
        for (int row = 0; row <=2*n -1; row++) {
            int totalcolInRow=row>n?2*n-row:row;
            for (int col = 0; col <totalcolInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }
    static void pattern7 (int n){
        for (int row = 0; row <=2*n -1; row++) {
            int totalcolInRow=row>n?2*n-row:row;

            int noOfSpaces=n-totalcolInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
                
            }
            for (int col = 0; col <totalcolInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }
     static void pattern8(int n){
         for (int row = 1; row <=n ; row++) {
             for (int spaces = 0; spaces < n-row; spaces++) {
                 System.out.print(" ");
                 
             }
             for (int col = row; col >=1 ; col--) {
                 System.out.print(col);
                 
             }
             for (int col = 2; col <=row ; col++) {
                 System.out.print(col);
                 
             }
             System.out.println();

         }
     }
      static void pattern9(int n){
         for (int row = 1; row <=2*n ; row++) {
             int totalcolInRow=row>n?2*n-row:row;
             for (int spaces = 0; spaces < n-totalcolInRow; spaces++) {
                 System.out.print(" ");

             }
             for (int col =totalcolInRow; col >=1 ; col--) {
                 System.out.print(col);

             }
             for (int col = 2; col <=totalcolInRow ; col++) {
                 System.out.print(col);

             }
             System.out.println();

         }
     }



}
