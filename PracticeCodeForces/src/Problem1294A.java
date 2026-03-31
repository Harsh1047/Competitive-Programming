import java.util.Scanner;

public class Problem1294A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            if((n+a+b+c)%3==0 && (n+a+b+c)/3>=Math.max(a,Math.max(b,c))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
