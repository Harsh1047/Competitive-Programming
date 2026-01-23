import java.util.Arrays;
import java.util.Scanner;

public class ProblemJOHNY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int s=0;
            for(int i=0;i<n;i++){
                if(i==k-1) s=arr[i];
            }
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                if(arr[i]==s) {
                    System.out.println(i+1); break;
                }
            }
        }
    }
}
