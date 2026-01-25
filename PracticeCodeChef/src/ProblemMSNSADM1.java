import java.util.Scanner;

public class ProblemMSNSADM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] brr = new int[n];
            int[] trr = new int[n];
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            for(int i=0;i<n;i++) brr[i] = sc.nextInt();
            for(int i=0;i<n;i++){
                if((arr[i]*20)-(brr[i]*10)>0) trr[i] = (arr[i]*20)-(brr[i]*10);
                else trr[i] = 0;
                if(trr[i]>max) max = trr[i];
            }
            System.out.println(max);

        }
    }
}
