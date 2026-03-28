import java.util.Arrays;
import java.util.Scanner;

public class ProblemMINDIS6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int k = sc.nextInt();
            int count=0;
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int[] hash = new int[n+2];
            for(int i=0;i<n;i++) hash[arr[i]]++;
            for(int i=0;i<n+1;i++) if(hash[i]>0) count++;
            hash[arr[0]] = Integer.MAX_VALUE;
            Arrays.sort(hash);
                for(int i=0;i<n+2;i++) {
                    if(hash[i]>0){
                        if(hash[i]<=k) {
                            k-=hash[i];
                            hash[i] = 0;
                            count--;
                        }
                        else break;
                    }
            }
            System.out.println(count);
        }
    }
}
