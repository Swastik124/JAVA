import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> primes  = ob.sieveOfEratosthenes(N);
            for(int prime : primes) {
                System.out.print(prime+" ");
            }
            System.out.println();
        }
    }
}
class Solution {
    static ArrayList<Integer> sieveOfEratosthenes(int N) {
        ArrayList<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[N+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for (int p=2;p*p<=N;p++) {
            if (isPrime[p]) {
                for (int i=p*p;i<=N;i+=p) {
                    isPrime[i]=false;
                }
            }
        }
        for (int i=2;i<=N;i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
