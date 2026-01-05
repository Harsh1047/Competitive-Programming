import java.util.Scanner;

public class ProblemDIGSMPAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k=n;
            int copy=n+1;
            int sum=0; int sumcopy=0;
            while(n>0){
                sum+=n%10;
                sumcopy+=copy%10;
                copy/=10;
                n/=10;
                System.out.println(n);
                System.out.println(copy);
                System.out.println(sum);
                System.out.println(sumcopy);
            }
            if((sum%2==0 && sumcopy%2!=0) || (sum%2!=0 && sumcopy%2==0)) System.out.println(k+1);
            else System.out.println(k+2);
        }
    }
}