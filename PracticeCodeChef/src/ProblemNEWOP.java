import java.util.ArrayList;
import java.util.Scanner;

public class ProblemNEWOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int minval = arr[0];
            int maxval = arr[n - 1];
            for (int i = 1; i < n; i++) {
                minval = minval + 2 * arr[i];
            }
            for (int i = n - 2; i >= 0; i--) {
                maxval = arr[i] + 2 * maxval;
            }
            System.out.println(minval + " " + maxval);
        }
    }
}
