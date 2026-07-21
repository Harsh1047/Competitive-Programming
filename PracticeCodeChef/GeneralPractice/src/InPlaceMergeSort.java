import java.util.Arrays;
import java.util.Scanner;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar1 = new int[n];
        int[] ar2 = new int[n];
        for(int i=0;i<n;i++) ar1[i] = sc.nextInt();
        for(int i=0;i<n;i++) ar2[i] = sc.nextInt();
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            if(ar1[x]<ar2[y]) x++;
            else if(ar1[x]==ar2[y]){
                x++;
            }
            else{
                int temp = ar1[x];
                ar1[x] = ar2[y];
                ar2[y] = temp;
                x++;
                Arrays.sort(ar2);
            }
        }
        for(int i=0;i<n;i++) System.out.print(ar1[i] + " ");
        for(int i=0;i<n;i++) System.out.print(ar2[i] + " ");
    }
}
