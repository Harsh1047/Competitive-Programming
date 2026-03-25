import java.util.Arrays;
import java.util.Scanner;

public class Problem231C_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean is = false;
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            for(int i=1;i<n;i++) {
                if(arr[i-1]==arr[i] && arr[i]<arr[n-1]) {
                    is = false; break;
                }
                if(arr[n-1]>0 && arr[0]==0) is = false;
                else is = true;
            }
            if(is || n==1) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
