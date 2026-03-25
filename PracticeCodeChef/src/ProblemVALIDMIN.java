import java.util.Scanner;

public class ProblemVALIDMIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==b && a<=c || a==c && c<=b || b==c && b<=a) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
