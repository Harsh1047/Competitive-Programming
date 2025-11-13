import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem1696B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int count = 0;
            boolean iszero = false;
            int n = sc.nextInt();
            int[] arr = new int[n];
            ArrayList<Integer> arl = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for(int i=1;i<n;i++) {
                if ((arr[i] > 0 && (i==0 || arr[i-1]==0))) {
                    count++;
                }
            }
            if(arr.length==1 && arr[0] != 0){
                count++;
            }
            System.out.println(count);
        }
    }
}
