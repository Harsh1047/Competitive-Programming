import java.util.Scanner;

public class Problem224D_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long b = sc.nextLong();
            long g = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();
            long rmax = Math.min(b/x,g/y);
            long rmin = (b+g-1)/n + 1;
            if(x+y>n || x>b || y>g) System.out.println(-1);
            else if(rmin <= rmax) System.out.println(rmin);
            else System.out.println(-1);
        }
    }
}
