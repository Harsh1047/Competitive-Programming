import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ProblemMTYFRI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int motu=0, tomu=0;
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int q=0;
            if(n%2 == 0){
                q = n/2;
            }
            else q = n/2+1;
            int[] ar1 = new int[q];
            int[] ar2 = new int[n/2];
            int x=0;int y=0;
            for(int i=0;i<n;i++){
                if(i%2==0) {
                    ar1[x++] = arr[i];
                }
                else {
                    ar2[y++] = arr[i];
                }
            }
//            Arrays.sort(ar1);
//            for(int i=0;i<n/2;i++){
//                for(int j=0;j<n/2;j++){
//                    if(ar2[i]>ar2[j]){
//                        int temp = ar2[i];
//                        ar2[i] = ar2[j];
//                        ar2[j] = temp;
//                    }
//                }
//            }
            for(int i=0;i<q;i++){
                System.out.print(ar1[i] +" ");
            }
            System.out.println();
            for(int i=0;i<n/2;i++){
                System.out.print(ar2[i] +" ");
            }
            while(k>0){
                int max = ar1[0] - ar2[0];
                for(int i=0;i<n;i++){
                    if(ar1[i] - ar2[i] > max) max = ar1[i] - ar2[i];
                }

            }
        }
    }
}
