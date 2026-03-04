import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ProblemMAXCOUNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int[] hash = new int[10001];
            Arrays.fill(hash, 0);
            for(int i=0;i<n;i++) hash[arr[i]-1]++;
            int max = 0;
            int ind = 0;
            for(int i=0;i<n;i++){
                if(hash[i]>max){
                    max = hash[i];
                    ind = i;
                }
            }
            System.out.println(ind+1 +" "+max);
        }
    }
}
