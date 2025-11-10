import java.util.Arrays;
import java.util.Scanner;

public class Problem1850D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int count=0;
            int maxcount=0;
            Arrays.sort(arr);
            for(int i=1;i<n;i++){
                if(Math.abs(arr[i]-arr[i-1])<=k){
                    count++;
                }
                else{
                    maxcount = Math.max(count+1,maxcount);
                    count=0;
                }
            }
            maxcount = Math.max(count+1,maxcount);
            System.out.println(n-maxcount);
        }
    }
}
