import java.util.Scanner;

public class Problem230C_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();;
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            n--;
            long sum = n*(n+1)*(2*n+1)/6;
            if(arr[0]==1 || arr[n-1]==1) System.out.println(sum);
            else System.out.println(sum+1);

        }
    }
}
