import java.util.Scanner;

public class Problem1337A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(a+b<=c) System.out.println(b + " " + c + " " + d);
            else if(a+b==c || b+c==d) System.out.println(b + " " + c + " " + (d-1));
            else System.out.println(a + " " + b + " " + c);
        }
    }
}
