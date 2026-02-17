import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int[] pref = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        pref[0] = arr[0];
        for(int i=1;i<n;i++){
            pref[i] = pref[i-1] + arr[i];
        }
        for(int i=0;i<n;i++) System.out.print(pref[i] +" ");
        for(int i=0;i<k;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(pref[r-1] +" "+ pref[l-1]);
            if(Math.abs(pref[r-1] - pref[l-1])%2==0) System.out.println("Yes " + Math.abs(pref[l-1] - pref[r-1]));
            else System.out.println("No "+ Math.abs(pref[l-1] - pref[r-1]));
        }

    }
}
