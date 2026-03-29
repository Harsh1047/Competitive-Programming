import java.util.*;

public class ProblemCONTEST2210C1 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count=0;
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            for(int i=1;i<n;i++){
                if(gcd(arr[i-1],arr[i])==1) count++;
            }
            System.out.println(count);

        }
    }
}
