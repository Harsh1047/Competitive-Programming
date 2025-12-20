import java.util.Scanner;

public class Problem1490A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int count=0;
            float k=0;
            for(int i=1;i<n;i++){
                k = (float) Math.max(arr[i], arr[i - 1]) /Math.min(arr[i], arr[i-1]);
                while(k>2){
                    k/=2;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
