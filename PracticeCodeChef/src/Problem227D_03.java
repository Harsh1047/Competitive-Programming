import java.util.Arrays;
import java.util.Scanner;

public class Problem227D_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            String s = sc.next();
            int count=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i) == '1') arr[i] = 101;
                if(s.charAt(i) == '0') count++;
            }
            if(count<k) System.out.println(-1);
            else {
                Arrays.sort(arr);
                int sum=0;
                for(int i=0;i<k;i++) sum+=arr[i];
                System.out.println(sum);
            }

        }
    }
}
