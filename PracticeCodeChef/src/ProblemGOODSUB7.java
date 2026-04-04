import java.util.Scanner;

public class ProblemGOODSUB7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int prev = 1;
            int now = 1;
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            for(int i=1;i<n;i++){
                if(arr[i]%2!=arr[i-1]) {
                    now++;
//                    prev = Math.max(prev, now);
                }
                else {
                    prev = Math.max(prev, now);
                    now = 0;
                }
            }
            prev = Math.max(prev, now);
            System.out.println(prev);
        }
    }
}
