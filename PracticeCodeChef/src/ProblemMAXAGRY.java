import java.util.Scanner;

public class ProblemMAXAGRY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            k = (n-k)*(n-k+1)/2 + (k+1)*(k+2)/2;
            int total = n-k+(k*n-1);
            System.out.println(k);
        }
    }
}
