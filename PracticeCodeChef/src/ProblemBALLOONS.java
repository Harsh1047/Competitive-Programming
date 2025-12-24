import java.util.Scanner;

public class ProblemBALLOONS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int total = 0;
            for(int i=1;i<=n;i++){
                int x = sc.nextInt();
                total += i*x;
            }

            System.out.println(total);
        }
    }
}
