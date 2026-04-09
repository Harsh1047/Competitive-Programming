import java.util.Scanner;

public class ProblemMOVIE7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = Math.min(n,m)*c;
            if(n>m){
                n-=m;
                x+=(n*a);
            }
            else if(m>n){
                m-=n;
                x+=(m*b);
            }
            System.out.println(x);
        }
    }
}
