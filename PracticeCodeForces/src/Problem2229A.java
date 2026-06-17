import java.util.Scanner;

public class Problem2229A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            float max=Integer.MIN_VALUE;
            float min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                if(arr[i]>max) max = arr[i];
                if(arr[i]<min) min = arr[i];
            }
            float x = (max-min)/2;
            if(x!=(int)x) System.out.println((int)x+1);
            else System.out.println((int)x);

        }
    }
}
