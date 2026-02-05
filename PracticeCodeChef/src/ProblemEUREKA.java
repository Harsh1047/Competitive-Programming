import java.util.Scanner;

public class ProblemEUREKA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double n = sc.nextInt();
            double k = Math.pow(0.143*n,n);
            int z = (int)k;
//            System.out.println(k);
            if(k-z>0.5) System.out.println(z+1);
            else System.out.println(z);
        }
    }
}
