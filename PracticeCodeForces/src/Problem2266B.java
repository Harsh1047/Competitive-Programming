import java.util.Scanner;

public class Problem2266B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long x = Math.abs(a-b);
            long y = Math.abs(a+c-b);
            System.out.println(Math.max(x, y));
        }
    }
}
