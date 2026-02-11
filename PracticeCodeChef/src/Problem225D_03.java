import java.util.Scanner;

public class Problem225D_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] ar1 = new int[n];
            int[] ar2 = new int[n];
            int ind = 0;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++) ar1[i] = sc.nextInt();
            for(int i=0;i<n;i++) ar2[i] = sc.nextInt();
            for(int i=0;i<n;i++){
                if(Math.abs(ar1[i]-ar2[i]) < min) {
                    min = Math.abs(ar1[i] - ar2[i]);
                    ind = i;
                }
            }
            int sum=0;
            for(int i=0;i<n;i++){
                if(i == ind) sum+=ar2[i];
                else sum += ar1[i];
            }
            System.out.println(sum);
        }
    }
}
