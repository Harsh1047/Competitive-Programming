import java.util.Scanner;

public class Problem2227A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a%2!=0 && b%2!=0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
