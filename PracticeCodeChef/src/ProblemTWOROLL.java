import java.util.Scanner;

public class ProblemTWOROLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = 50-x;
            if(k<=2*(6+y-1) && k>=2*y) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
