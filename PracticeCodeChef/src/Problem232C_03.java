import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem232C_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        int total = 0;
        for(int i = arr[0]; i>0;i--){
            int supp = 0;
            for(int j=0;j<n;j++) {
                supp += arr[j]/i;
            }
            if(supp>=m) {
                total = i;
                break;
            }
            if(total>0) break;
        }
        System.out.println(total);
    }
}
