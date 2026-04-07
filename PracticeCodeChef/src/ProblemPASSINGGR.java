import java.util.Scanner;

public class ProblemPASSINGGR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int n1 = sc.nextInt();
            int count=1;
            for(int i=1;i<n;i++) {
                int k = sc.nextInt();
                if(k>=n1) count++;
            }
            System.out.println(count);
        }
    }
}
