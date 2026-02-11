import java.util.ArrayList;
import java.util.Scanner;

public class Problem225D_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean is = true;
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            for(int i=0;i<n;i++){
                if(arr[i]<0) arr[i] = -arr[i];
            }
            for(int i=1;i<n;i++){
                if(arr[i-1] != arr[i]) {
                    is = false; break;
                }
            }
            if(is) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
