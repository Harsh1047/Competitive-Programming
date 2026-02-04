import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem224D_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int count = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
                if(max - min > k) {
                    count++;
                    max = Integer.MIN_VALUE;
                    min = Integer.MAX_VALUE;
                }
            }
            System.out.println(count);
        }
    }
}
