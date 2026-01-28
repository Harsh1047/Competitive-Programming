import java.util.Scanner;

public class Problem223D_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] ar1 = new int[n];
            int[] ar2 = new int[n];
            boolean iseq = true;
            String res = "YES";
            int val=0, ind=0;
            for(int i=0;i<n;i++) ar1[i] = sc.nextInt();
            for(int i=0;i<n;i++) ar2[i] = sc.nextInt();
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(ar1[i]>ar2[i]){
                    res = "NO"; break;
                }
                else if(ar1[i]<ar2[i] && ar1[i]<=max){
                    res = "NO";
                }
                max = Math.max(max, ar1[i]);
            }
            System.out.println(res);
        }
    }
}
