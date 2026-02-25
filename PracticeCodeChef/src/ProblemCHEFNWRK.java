import java.util.Scanner;

public class ProblemCHEFNWRK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int wt=0;
            int count=0;
            boolean kx = false;
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int i=0;
            while(i<n){
                if(wt>k) {
                    kx = true;
                    break;
                }
                if(arr[i]<k){
                    while(wt<k){
                        wt+=arr[i];
                        arr[i] -= wt;
                        i++;
                    }
                }
                else i++;
                count++;
            }
            if(kx) System.out.println("-1");
            else System.out.println(count);
        }
    }
}
