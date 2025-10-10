import java.util.Arrays;
import java.util.Scanner;

public class Problem160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        int sum1 = 0;
        int sum2 = 0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            sum2+=arr[i];
        }
        for(int i=0;i<n;i++){
            sum1+=arr[n-i-1];
            count++;
            if(sum1>sum2/2){
                break;
            }
        }
        System.out.println(count);
    }
}
