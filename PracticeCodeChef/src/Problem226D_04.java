import java.util.Arrays;
import java.util.Scanner;

public class Problem226D_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int total=0;
            for(int i=1;i<n;i++){
                for(int j=1;j<n;j++){
                    if(arr[i]!=arr[j] && k>0) {
                        arr[i] = arr[j];
                        k--;
                    }
                    else break;
                }
            }
            if(arr[0]!=arr[1]) total++;
            for(int i=1;i<n;i++) if(arr[i-1]!=arr[i]) total++;
            System.out.println(total);
        }
    }
}
