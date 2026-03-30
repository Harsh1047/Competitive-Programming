import java.util.Scanner;

public class Problem1358A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if((n*m)%2==0) System.out.println(n*m/2);
            else System.out.println(n*m/2+1);
        }
    }
}
