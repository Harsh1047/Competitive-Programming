import java.util.ArrayList;
import java.util.Scanner;

public class ProblemSample {

    static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int q = sc.nextInt();
        sc.nextInt(); // columns = 2
        int count = 0;
        for(int i=0;i<q;i++){
            int q1 = sc.nextInt()-1;
            int q2 = sc.nextInt();
            arr[q1] = q2;
            if(existsGoodSubsequence(arr,p)) count++;
        }
        if(n<=2) System.out.println(0);
        else System.out.println(count);

    }
    private static boolean existsGoodSubsequence(int[] a, int p) {
        if (a.length <= 1) return false;
//        for (int k : a) if (k == p) return true;
        for(int i=0 ; i<a.length-1 ; i++){
            if(a[i]==p) return true;
            else{
                for(int j=i+1 ; j<a.length ; j++) {
                    if (gcd(a[i], a[j]) == p) return true;
            }
            }
        }
        return false;
    }
}
