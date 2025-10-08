import java.util.Scanner;

public class Problem207D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arrx = new int[n];
            int[] arry = new int[n];
            for(int i=0;i<n;i++){
                arrx[i] = sc.nextInt();
                arry[i] = sc.nextInt();
            }
            int k = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int j = Math.abs(arrx[i] - a) + Math.abs(arry[i] - b);
                k = Math.min(k,j);
            }
            System.out.println(k);
        }
    }
}
