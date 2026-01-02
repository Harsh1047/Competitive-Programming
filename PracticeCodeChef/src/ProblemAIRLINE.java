import java.util.Scanner;

//public class ProblemAIRLINE {
//    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int t = sc.nextInt();
//            while(t-->0){
//                boolean ischeckin = false;
//                int a = sc.nextInt();
//                int b = sc.nextInt();
//                int c = sc.nextInt();
//                int d = sc.nextInt();
//                int e = sc.nextInt();
//                if(a+b<d || b+c<d || c+a<d){
//                    ischeckin = true;
//                }
//                if(ischeckin && a<e || b<e || c<e) System.out.println("YES");
//                else System.out.println("NO");
//            }
//    }
//}
import java.io.*;
import java.util.*;

public class ProblemAIRLINE {

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
            a[i] = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        sc.nextInt(); // columns = 2
        int yesCount = 0;
        for (int qi = 0; qi < q; qi++) {
            int idx = sc.nextInt() - 1;
            int val = sc.nextInt();
            a[idx] = val;
            if (existsGoodSubsequence(a, p)) {
                yesCount++;
            }
        }

        System.out.println(yesCount);
    }

    private static boolean existsGoodSubsequence(int[] a, int p) {
        for(int i=0 ; i<a.length-1 ; i++){
            for(int j=i+1 ; j<a.length ; j++){
                if(gcd(a[i],a[j])==p) return true;
            }
        }
        return false;
    }
}
