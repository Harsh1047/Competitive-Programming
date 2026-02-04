import java.util.Scanner;

public class Problem224D_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int t = 2*Math.max(x,y);
        if(n>=t) System.out.println("Yes");
        else System.out.println("No");
    }
}
