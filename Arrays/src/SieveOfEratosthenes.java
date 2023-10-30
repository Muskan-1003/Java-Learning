import java.util.Scanner;

public class SieveOfEratosthenes  {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n =input.nextInt();
        SieveOfEratosthenes sieve = new SieveOfEratosthenes();
        int count = sieve.countPrimes(n);

        System.out.println(count);

    }

    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] composites=new boolean[n];
        for(int i=2; i<=Math.sqrt(n); i++ ){
            if(composites[i]==false){
                for(int j=i*i; j<n; j=j+i){
                    composites[j]=true;
                }
            }
        }
        int count = 0;
        for(int i=2; i<n; i++){
            if(composites[i]==false){
                count++;
            }

        }
        return count;
    }
}