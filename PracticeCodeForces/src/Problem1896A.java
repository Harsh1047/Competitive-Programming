import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1896A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            boolean istrue = false;
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] arr2 = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                arr2[i] = arr[i];
            }
            Arrays.sort(arr2);
            if(arr[0]==arr2[0]){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
