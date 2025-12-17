import java.sql.SQLOutput;
import java.util.Scanner;

public class ProblemMAKEAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            long min = Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                if(arr[i] - arr[i-1]<min) min = arr[i] - arr[i-1];
            }
            if(min==Integer.MAX_VALUE || arr[n-1] - arr[0] == 0){
                System.out.println(0);
            }
            else{
                System.out.println((arr[n-1] - arr[0])/min + 1 - n);
            }
        }
    }
}
