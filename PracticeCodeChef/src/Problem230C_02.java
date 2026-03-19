import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Problem230C_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer[] arr = new Integer[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            Arrays.sort(arr, Collections.reverseOrder());
            int count=0;
            for(int i=0;i<k;i++) {
                if(arr[i]>5) count+=arr[i]-5;
                else break;
            }
            for(int i=k;i<n;i++){
                if(arr[i]>10) count+=arr[i]-10;
                else break;
            }


            System.out.println(count);

        }
    }
}
