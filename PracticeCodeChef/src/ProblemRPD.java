import java.util.Scanner;

public class ProblemRPD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int max = 0;
            int sum=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int x = arr[i]*arr[j];
                    while(x>0){
                        int k = x%10;
                        sum+=k;
                        x/=10;
//                        System.out.print(sum + " ");
                    }
                    max = Math.max(max, sum);
                    sum=0;
                }
            }
            System.out.println(max);
        }
    }
}
