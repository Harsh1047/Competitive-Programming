import java.util.Scanner;

public class Problem1875A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long totaltime=0;
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            for(int i=0;i<n;i++){
                long x = sc.nextLong();
                if(x>=a){
                    totaltime+=a-1;
                }
                else{
                    totaltime+=x;
                }
            }
            System.out.println(totaltime+b);
        }
    }
}
