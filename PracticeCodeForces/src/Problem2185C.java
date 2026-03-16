import java.util.Arrays;
import java.util.Scanner;

public class Problem2185C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int count=1;
            int oldc=1;
            for(int i=1;i<n;i++){
                if(arr[i-1]==arr[i]-1){
                    count++;
                }
                else if(arr[i-1]==arr[i]) continue;
                else {
                    count = Math.max(count,oldc);
                    oldc = count;
                    count=1;
                }
            }
            count = Math.max(count,oldc);
            System.out.println(count);
        }
    }
}
