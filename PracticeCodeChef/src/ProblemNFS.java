import java.util.Scanner;

public class ProblemNFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int a = sc.nextInt();
            int s = sc.nextInt();
            double x = Math.sqrt(u*u - 2*a*s > 0 ? u*u - 2*a*s : 0);
            System.out.print(x +" ");
            System.out.println(v>=x ? "YES":"NO");;
        }
    }
}
