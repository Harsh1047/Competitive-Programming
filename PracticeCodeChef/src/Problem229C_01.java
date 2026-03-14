import java.util.Scanner;

public class Problem229C_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            b-=2*a;
            if(c-3*b==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
