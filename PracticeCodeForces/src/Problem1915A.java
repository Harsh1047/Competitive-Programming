import java.util.Scanner;

public class Problem1915A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if(x==y) System.out.println(z);
            else if(y==z) System.out.println(x);
            else System.out.println(y);

        }
    }
}
