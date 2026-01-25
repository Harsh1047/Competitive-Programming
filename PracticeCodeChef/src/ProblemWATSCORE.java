import java.util.Scanner;

public class ProblemWATSCORE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[11];
            for(int i=0;i<n;i++){
                int p = sc.nextInt();
                int q = sc.nextInt();
                if(q>arr[p-1]) arr[p-1] = q;
            }
            int sum=0;
            for(int i=0;i<8;i++){
                sum+=arr[i];
            }
            System.out.println(sum);
        }
    }
}
