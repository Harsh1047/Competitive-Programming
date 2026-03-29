import java.util.Scanner;

public class ProblemCONTEST2210A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n==1) System.out.println(1);
            else if(n==2){
                System.out.print(n + " ");
                System.out.println(n-1 + " ");
            }
            else {
                System.out.print(n - 1 + " ");
                System.out.print(n + " ");
                for (int i = n - 2; i > 1; i--) {
                    System.out.print(i + " ");
                }
                System.out.println(1);
            }
        }
    }
}
