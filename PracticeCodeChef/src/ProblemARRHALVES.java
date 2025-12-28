import java.util.Scanner;

public class ProblemARRHALVES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i=0;i<n/2;i++){
                if(arr[i]>max) max = arr[i];
            }

            for(int i=n/2;i<n;i++){
                if(arr[i]<min) min = arr[i];
                }
        }
    }
}
