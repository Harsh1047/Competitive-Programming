import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Sumof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> arl = new ArrayList<>();
        int x=0;
        int y=0;
        int z=0;
        for(int i=0;i<n;i++){
            x=arr[i];
            for(int j=i+1;j<n;j++){
                y=arr[j];
                for(int k=j+1;k<n;k++){
                    z = arr[k];
                    if(x!=y && y!=z && x+y+z==0){
                        arl.add(i);
                        arl.add(j);
                        arl.add(k);
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arl.get(i)+" ");
        }
    }
}
