import java.util.Scanner;

public class ProblemMAKEARRAYODD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long x = sc.nextLong();
            long count=0;
            for(int i=0;i<n;i++){
                long s = sc.nextLong();
                if(s%2==0) count++;
            }
            if(count==0) System.out.println(0);
            else if(x%2!=0) System.out.println((count+1)/2);
            else{
                if(count==n) System.out.println(-1);
                else System.out.println(count);
            }
        }
    }
}
