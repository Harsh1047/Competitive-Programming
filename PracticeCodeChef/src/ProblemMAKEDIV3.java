import java.util.Scanner;

public class ProblemMAKEDIV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            if (n == 1) System.out.println(3);
            else {
                int k = 0;
                while (true) {
                    if (n % 3 == 0 && n % 9 != 0) break;
                    else {
                        n++;
                        k++;
                    }
                }
                for (int i = 0; i < k; i++) System.out.print(2);
                for (int i = 0; i < n - k - k; i++) {
                    System.out.print(1);
                }
            }
            System.out.println();
        }

    }
}
