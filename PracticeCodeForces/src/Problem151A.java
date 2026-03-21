import java.util.Scanner;

public class Problem151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int salt = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int totallit = k*l;
        int slices = c*d;
        int x = Math.min(totallit/nl, slices);
        int y = Math.min(x,salt/np);
        System.out.println(y/n);
    }
}
