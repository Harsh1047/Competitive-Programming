import java.util.Arrays;
import java.util.Scanner;

public class ProblemCNDY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[2*n];
            for(int i=0;i<2*n;i++){
                arr[i] = sc.nextInt();
            }
            boolean isnot = false;
            Arrays.sort(arr);
            for(int i=2;i<2*n;i++){
                if(arr[i-2]==arr[i-1] && arr[i-1]==arr[i]){
                    isnot = true;
                    break;
                }
            }
            if(isnot) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
