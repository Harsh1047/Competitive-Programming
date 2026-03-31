import java.util.Arrays;
import java.util.Scanner;

public class ProblemNOREAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean isok = true;
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            for(int i=1;i<n;i++){
                if(arr[i-1]>=arr[i]) {
                    isok = false; break;
                }
            }


            if(!isok) {
                int med = arr[n/2-1];
                Arrays.sort(arr);
                for(int i=1;i<n;i++){
                    if((n-i)/2>=1) {
                        if (arr[(n - i) / 2 - 1] != med) {
                            if(n-i>i) System.out.println(i + " " + (n-i));
                            else System.out.println((n-i) + " " + i);
                            break;
                        }
                    }
                }
            }
            else System.out.println(-1);
        }
    }
}
