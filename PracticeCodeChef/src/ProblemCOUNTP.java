import java.util.Scanner;

public class ProblemCOUNTP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            long countodd=0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
                if(arr[i]%2!=0) countodd++;
            }
            if(countodd%2==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
