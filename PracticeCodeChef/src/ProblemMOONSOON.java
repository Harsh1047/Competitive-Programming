import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ProblemMOONSOON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int h = sc.nextInt();
            Integer[] carcap = new Integer[n];
            Integer[] outpow = new Integer[m];
            for(int i=0;i<n;i++) carcap[i] = sc.nextInt();
            for(int i=0;i<m;i++) outpow[i] = sc.nextInt();
            Arrays.sort(carcap, Collections.reverseOrder());
            Arrays.sort(outpow, Collections.reverseOrder());
            long tot = 0;
            for(int i=0;i<Math.min(n,m);i++) {
                if(carcap[i]>=(long)outpow[i]*h) tot+=(long)h*outpow[i];
                else tot+=carcap[i];
            }
            System.out.println(tot);
        }
    }
}
