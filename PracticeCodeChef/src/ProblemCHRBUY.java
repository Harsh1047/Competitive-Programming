import java.util.Scanner;

public class ProblemCHRBUY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int w = sc.nextInt();
            int p = sc.nextInt();
            int k = sc.nextInt();
            if(k>w) {
                int z = k - w;
                System.out.println(w * 2 + z);
            }
            else System.out.println(k*2);
        }
    }
}
