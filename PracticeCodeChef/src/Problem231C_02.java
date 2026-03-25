import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Problem231C_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int[] brr = new int[n];
            int maxtasty = 0;
            boolean is = false;
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            for(int i=0;i<n;i++) brr[i] = sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int max = Math.max(arr[i], arr[j]);
                    int min = Math.min(arr[i], arr[j]);

                    int dis = Math.min(max/2, 100);
                    int cost = max+min-dis;
                    if(cost<=k){
                        int currtasty = brr[i]+brr[j];
                        maxtasty = Math.max(maxtasty, currtasty);
                        is = true;
                    }
                }
            }
            if(is) System.out.println(maxtasty);
            else System.out.println(0);
        }
    }
}
