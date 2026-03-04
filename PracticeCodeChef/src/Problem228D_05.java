import java.util.Scanner;

public class Problem228D_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            System.out.println((n+q)/(2*(q+1)));
        }
    }
}