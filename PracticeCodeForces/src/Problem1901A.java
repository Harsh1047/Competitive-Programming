import java.util.Scanner;

public class Problem1901A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int l = sc.nextInt();
                arr[i] = l;
            }
            int maxGap = arr[0];
            for(int i=1;i<n;i++){
                maxGap = Math.max(maxGap , arr[i] - arr[i-1]);
            }
            maxGap = Math.max(maxGap , 2*(x-arr[n-1]));
            System.out.println(maxGap);
        }
    }
}