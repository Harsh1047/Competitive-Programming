import java.util.Scanner;

public class Problem2224A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count=0;
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int sum=0;
            for(int i=n-1;i>0;i--) {
                if(arr[i]>0){
                    sum+=arr[i];
                    count++;
                }
                else if(arr[i]<=0 && Math.abs(arr[i])<=sum){
                    count++;
                    sum+=(sum+arr[i]);
                }
                else if(arr[i]<=0 && Math.abs(arr[i])>sum){
                    sum=0;
                }
            }
            System.out.println(count);
        }
    }
}
