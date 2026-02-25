import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemREMELEM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            if(n==1) System.out.println("YES");
            else{
                Arrays.sort(arr);
                if(arr[0]+arr[n-1] <= k) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
