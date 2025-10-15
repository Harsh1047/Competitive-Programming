import java.util.Arrays;
import java.util.Scanner;

public class Problem208D3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count = 0;
            int rank = 1;
            int x = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();

            }
            Arrays.sort(arr);
            for(int i=1;i<=Math.min(k,n);i++){
                arr[n-i] = 0;
                x+=100;
            }
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                if(arr[i] > x){
                    rank++;
                }
            }
            System.out.println(rank);
        }
    }
}
