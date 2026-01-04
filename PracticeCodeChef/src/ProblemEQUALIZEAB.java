import java.util.Scanner;

public class ProblemEQUALIZEAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int dif = Math.abs(b-a);
            if(dif%(x*2)==0 || a==b) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
