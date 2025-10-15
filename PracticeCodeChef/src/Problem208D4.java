import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem208D4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if(n>=2) {
                Arrays.sort(arr);
                int[] ar2 = new int[2];
                ar2[0] = arr[0];
                ar2[1] = arr[n - 1];
                if (ar2[0] == ar2[1] - 1) {
                    System.out.println(ar2[0] - 1);
                } else {
                    System.out.println(ar2[1] - 1);
                }
            }
            else{
                System.out.println(arr[n-1]-1);
            }
        }
    }
}
