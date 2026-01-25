import java.util.Arrays;
import java.util.Scanner;

public class ProblemREMOVEBAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int[] hash = new int[n];
            for(int i=0;i<n;i++) hash[arr[i]-1]++;
//            for(int i=0;i<n;i++) System.out.print(hash[i]+" ");
            Arrays.sort(hash);
//            for(int i=0;i<n;i++) System.out.print(hash[i]+" ");
            System.out.println(Math.abs(hash[n-1]-n));
        }
    }
}
