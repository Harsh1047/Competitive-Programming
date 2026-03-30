import java.util.Arrays;
import java.util.Scanner;

public class ProblemTACHSTCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1]<=d) {
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}
