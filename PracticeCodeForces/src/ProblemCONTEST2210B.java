import java.util.Scanner;

public class ProblemCONTEST2210B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count=0;
            for(int i=0;i<n;i++) {
                int x = sc.nextInt();
                if(x<=i+1) count++;
            }
            System.out.println(count);
        }
    }
}
