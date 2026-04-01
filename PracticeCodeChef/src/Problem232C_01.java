import java.util.Scanner;

public class Problem232C_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int count=0;
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                if(arr[i]>max) max = arr[i];
                if(arr[i]<min) min = arr[i];
            }
            for(int i=0;i<n;i++){
                if(arr[i]==max || arr[i]==min) count++;
            }
            System.out.println(n-count);

        }
    }
}
