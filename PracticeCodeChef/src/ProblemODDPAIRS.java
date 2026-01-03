import java.util.Scanner;

public class ProblemODDPAIRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long n = sc.nextInt();
            long odd = 0;
            long even = 0;
            if (n % 2 == 0) {
                odd = n / 2;
                even = n / 2;
            } else {
                odd = n / 2 + 1;
                even = n / 2;
            }
            System.out.println(2 * odd * even);
        }
    }
}
