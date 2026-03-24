import java.util.Arrays;
import java.util.Scanner;

public class ProblemFIRSTCNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] cpy = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                cpy[i] = arr[i];
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]>max) max = arr[i];
                if(arr[i]<min) min = arr[i];
            }

        }
    }
}
