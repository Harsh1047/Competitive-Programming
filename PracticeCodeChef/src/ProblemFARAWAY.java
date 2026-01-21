import java.util.Scanner;

public class ProblemFARAWAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long m = sc.nextLong();
            long count=0;
            long[] arr = new long[(int)n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
                if(arr[i]>m/2) count+=arr[i]-1;
                else count+=m-arr[i];
            }
            System.out.println(count);
        }
    }
}
