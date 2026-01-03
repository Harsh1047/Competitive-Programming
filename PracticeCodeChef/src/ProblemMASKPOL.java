import java.util.Scanner;

public class ProblemMASKPOL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int k = n-a;
            if(k<a) System.out.println(k);
            else System.out.println(a);
        }
    }
}
