import java.util.HashSet;
import java.util.Scanner;

public class Problem2152A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashSet<Integer> hashSet = new HashSet<>();
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                hashSet.add(arr[i]);
            }
            System.out.println(hashSet.size()*2-1);
        }
    }
}
