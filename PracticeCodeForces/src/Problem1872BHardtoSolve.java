import java.util.Scanner;

public class Problem1872BHardtoSolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] d = new int[n];
            int[] s = new int[n];
            for(int i=0;i<n;i++){
                d[i] = sc.nextInt();
                s[i] = sc.nextInt();
            }
            int k=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                k = Math.min(k,d[i] + (s[i]-1)/2 );
            }
            System.out.println(k);
        }
    }
}
