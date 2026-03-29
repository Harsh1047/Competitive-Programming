import java.util.Arrays;
import java.util.Scanner;

public class ProblemMAXDIFF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int total = 0;
            int w1 = 0;
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                total+=arr[i];
            }
            Arrays.sort(arr);
            if(k>n/2) {
                for (int i = n-1; i > n-k-1; i--) {
                    w1+=arr[i];
                }
            }
            else {
                for(int i=0;i<k;i++){
                    w1+=arr[i];
                }
            }
            System.out.println(Math.abs(total-2*w1));
        }
    }
}
