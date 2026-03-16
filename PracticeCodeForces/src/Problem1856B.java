import java.util.Scanner;

public class Problem1856B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            long count=0;
            long diff=0;
            long one = 0;
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                count+=arr[i];
                if(arr[i]==1) {
                    one++;
                }
                if(arr[i]!=1){
                    diff+=arr[i]-1;
                }
            }
            if(diff>=one && n>1) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
