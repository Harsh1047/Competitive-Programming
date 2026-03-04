import java.util.Scanner;

public class Problem228D_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>y) System.out.println("Alice");
        else if(x==y) System.out.println("Draw");
        else System.out.println("Bob");
    }
}
