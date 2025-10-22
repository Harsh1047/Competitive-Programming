import java.util.Arrays;
import java.util.Scanner;

public class ProblemP3209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            int j=1;
            for(int i=0;i<n;i++){
                arr[i][0] = j;
                arr[i][1] = gcd(j,n);
                j++;
            }
            Arrays.sort(arr, (a,b)->{if(a[1]!=b[1]) return b[1]-a[1]; else return a[0]-b[0];});
            for(int i=0;i<n;i++){
                System.out.print(arr[i][0]+" ");
            }
            System.out.println();
        }
    }

    public static int gcd(int a, int b) {
        int gcd = 1;
        for (int i=1; i <= Math.min(a, b); i++) {
            if (a%i==0 && b%i==0) {
                gcd=i;
            }
        }
        return gcd;
    }
}
