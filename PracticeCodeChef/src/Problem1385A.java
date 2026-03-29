import java.util.Scanner;

public class Problem1385A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==b && a>=c || b==c && b>=a || a==c && a>=b) {
                System.out.println("YES");
                int max = Math.max(a, Math.max(b,c));
                int min = Math.min(a, Math.min(b,c));
                System.out.println(max + " " + min + " " + min);
            }
            else System.out.println("NO");
        }
    }
}
