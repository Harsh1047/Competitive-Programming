import java.util.Scanner;

public class Problem1726A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long[] arr = new long[(int)n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            long max=arr[(int)n-1] - arr[0];
            for(int i=1;i<n;i++){
                max = Math.max(max,arr[i-1]-arr[i]);
            }
            for(int i=0;i<n-1;i++){
                max = Math.max(max, arr[(int)n-1]-arr[i]);
            }
            for(int i=1;i<n;i++){
                max = Math.max(max, arr[i] - arr[0]);
            }
            System.out.println(max);
        }
    }
}
