import java.util.Scanner;

public class Problem226D_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        float m = sc.nextInt();
        float a = sc.nextInt();
        if(m/n<=a) System.out.println("YES");
        else System.out.println("NO");
    }
}
