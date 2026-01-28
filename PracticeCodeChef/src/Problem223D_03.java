import java.util.Scanner;

public class Problem223D_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            // x%k==0
            int q = x%k;
            if(q==0) System.out.println(0);
            else if(k-q<q && x+k-q<=n) System.out.println(k-q);
            else System.out.println(q);
        }
    }
}
