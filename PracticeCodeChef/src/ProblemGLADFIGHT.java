import java.util.Scanner;

public class ProblemGLADFIGHT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = n/2;
            int sum1=0;
            if(n>2) {
                while(x>0){
                    sum1+=x;
                    x--;
                }
                System.out.print(sum1);
                n--;
                int sum=0;
                while(n-->0){
                    sum+=n;
                }
                System.out.println(" " + sum);
            }
            else System.out.println(0 + " " +0);

        }
    }
}
