import java.util.Arrays;
import java.util.Scanner;

public class ProblemPERMEXIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            boolean is = false;
            for(int i=1;i<n;i++){
                if(arr[i]-arr[i-1]>1){
                    is = true;
                    break;
                }
            }
            if(is) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
