import java.util.HashSet;
import java.util.Scanner;

public class Problem232C_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }
        for(int i=0;i<q;i++){
            int x = sc.nextInt();
            if(x>n) System.out.println(x+max-min);
            else{
                int count=0;
//                for()
//                HashSet<Integer> set = new HashSet<>();
//                for(int j=0;j<x;j++) {
//                    for(int k=0;k<n;k++) {
//                        set.add(arr[k] + j);
//                    }
//                }
//                System.out.println(set.size());
            }

        }
    }
}
