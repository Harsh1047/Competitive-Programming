import java.util.Arrays;
import java.util.Scanner;

public class ProblemREMOVECARDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt();
             int[] arr = new int[n];
             int[] hash = new int[11];
             for(int i=0;i<n;i++){
                 arr[i] = sc.nextInt();
                 hash[arr[i]]++;
             }
            Arrays.sort(hash);

            System.out.println(n-hash[10]);
        }
    }
}
