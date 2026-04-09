import java.util.Arrays;
import java.util.Scanner;

public class ProblemKMED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int first = 0, back = 0;
            k = n-k-1;
            if(k%2==0) {
                first = k/2; back = first;
            }
            else {
                first = k/2; back = first+1;
            }
            System.out.print(arr[first] + " ");
            for(int i = first+1; i < n - back;i++) {
                if(arr[i]!=arr[i-1]) System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
