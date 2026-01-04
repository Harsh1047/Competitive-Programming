import java.util.Scanner;

public class ProblemPRIME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            boolean isprime = true;
            int m = sc.nextInt();
            int n = sc.nextInt();
            int end=0;
            if(n-m%2==0) end = (n-m)/2;
            else end = (n-m)/2+1;
            for(int i=m;i<=n;i++){
                for(int j=2;j<=end;j++){
                    if(i%j==0) isprime = false;
                    break;
                }
                if(isprime) System.out.println(i);
            }
            System.out.println();
        }
    }
}
