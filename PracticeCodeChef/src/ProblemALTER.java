import java.util.Scanner;

public class ProblemALTER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(p%a == 0 && q%b == 0 || q%a == 0 && p%b == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
