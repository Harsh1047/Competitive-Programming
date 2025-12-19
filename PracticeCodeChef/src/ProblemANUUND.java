import java.util.Arrays;
import java.util.Scanner;

public class ProblemANUUND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int[] ar2 = new int[n];
            int j=0;
            for(int i=0;i<n;i=i+2){
                ar2[i] = arr[j];
                j++;
            }
            j=0;
            for(int i=1;i<n;i=i+2){
                ar2[i] = arr[n-j-1];
                j++;
            }
            for(int i=0;i<n;i++){System.out.print(ar2[i]+ " ");}
        }
        System.out.println();
    }
}
