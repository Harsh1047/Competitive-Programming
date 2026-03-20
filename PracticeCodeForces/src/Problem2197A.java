import java.util.Scanner;

public class Problem2197A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextInt();
            if(n%9==0) System.out.println(10);
            else System.out.println(0);
        }
    }
}
