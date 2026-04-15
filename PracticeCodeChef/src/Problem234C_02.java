import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem234C_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int count=0;
            int sum=0;
            ArrayList<Integer> arl = new ArrayList<>();
            for(int i=0;i<n;i++){
                if(arr[i]>0) {
                    count++;
                    sum+=arr[i];
                }
                else arl.add((arr[i]));
            }
            Collections.sort(arl,Collections.reverseOrder());
            for(int i=0;i<arl.size();i++){
                if(sum+arl.get(i)>=0){
                    sum+=arl.get(i);
                    count++;
                }
                else break;
            }
            System.out.println(count);
        }
    }
}
