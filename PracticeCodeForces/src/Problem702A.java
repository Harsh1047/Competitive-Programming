import java.util.Scanner;

public class Problem702A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int count=1;
        int maxcount=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]) count++;
            else count=1;
            maxcount = Math.max(maxcount, count);
        }
        System.out.println(maxcount);
    }
}
