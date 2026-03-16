import java.util.Scanner;

public class Problem2208A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++) arr[i][j] = sc.nextInt();
            }
            int k = n*n;
            int q=0;
            int[] hash = new int[k+1];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    hash[arr[i][j]]++;
                }
            }
            for(int i=0;i<n;i++){
                if(hash[i]>n-2) {
                    q=1; break;
                }
            }
            if(q==1 || n==1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
