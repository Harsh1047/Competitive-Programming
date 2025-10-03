import java.util.Scanner;

public class Problem2148B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            for(int i=0;i<n;i++){
                int k = sc.nextInt();
                arr1[i] = k;

            }
            for(int i=0;i<m;i++){
                int k = sc.nextInt();
                arr2[i] = k;

            }
            System.out.println(n+m);
        }
    }
}
