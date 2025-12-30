import java.util.Scanner;

public class ProblemADJSUMPARNotSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            if(arr[n-1]!=arr[0] || n%2==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
