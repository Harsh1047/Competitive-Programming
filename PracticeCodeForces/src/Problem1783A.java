import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem1783A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            boolean istrue = true;
            int n = sc.nextInt();
            int[] arr = new int[n];
            ArrayList<Integer> arl = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                arl.add(arr[i]);
            }
            int k = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                k=Math.max(arr[i],k);
            }
            arl.remove(Integer.valueOf(k));
            Collections.sort(arl);
            if(arr[0] == arr[n-1]){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                System.out.print(k+" ");
                for(int i=0;i<arl.size();i++){
                    System.out.print(arl.get(i)+" ");
                }
                System.out.println();
            }

        }
    }
}
