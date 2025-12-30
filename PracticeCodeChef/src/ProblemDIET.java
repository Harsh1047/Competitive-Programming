import java.util.Scanner;

public class ProblemDIET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int i=0;
            int rem=0;
            boolean ispossible = true;
            while(i<n){
                if(arr[i]>=k){
                    rem+=arr[i]-k;
                }
                else{
                    if(rem+arr[i]>=k) rem+=arr[i]-k;
                    else {
                        ispossible = false; break;
                    }
                }
                i++;
            }
            if(ispossible) System.out.println("YES");
            else System.out.println("NO " + (i+1));
        }
    }
}
