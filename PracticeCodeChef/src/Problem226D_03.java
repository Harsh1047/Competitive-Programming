import java.util.Scanner;

public class Problem226D_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            while(true){
                if(n>=a) {
                    n -= a;
                    n += b;
                }
                else break;
            }
            System.out.println(n);
        }
    }
}
