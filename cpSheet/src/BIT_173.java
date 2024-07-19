import java.util.*;

 public class BIT_173 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n=input.nextInt();
        int x=0;
        for(int i=0;i<n;i++){
            String str=input.next();
            if(str.contains("++")){
                x++;
            }
            if(str.contains("--")){
                x--;
            }
        }

        System.out.println(x);
    }

}
