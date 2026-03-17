import java.util.Scanner;

public class ProblemCUTPIZ {

    public static int gcd(int a,int b){
        while(b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int mindiff = Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                if(arr[i]-arr[i-1]<mindiff) mindiff = arr[i] - arr[i-1];
            }
            mindiff = Math.min(360 - arr[n-1], mindiff);
            int cuts=0;
            cuts = 360/mindiff - n;
//            System.out.println(mindiff);
            System.out.println(cuts);
        }
    }
}
