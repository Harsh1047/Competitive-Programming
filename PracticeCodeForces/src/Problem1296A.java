import java.util.Scanner;

public class Problem1296A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum=0;
            boolean odd = false; boolean even = false;
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            for(int i=0;i<n;i++){
                if(arr[i]%2==0) even = true;
                else odd = true;
                sum+=arr[i];
            }
            if(even && odd || sum%2!=0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
