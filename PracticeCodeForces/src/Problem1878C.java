import java.util.Scanner;

public class Problem1878C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            long minsum = k*(k+1)/2;
            long maxsum = n*(n+1)/2-(n-k)*(n-k+1)/2;
            if(x>=minsum && x<=maxsum){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
