import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem2148D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            long count=0;
            ArrayList<Integer> arodd = new ArrayList<>();
            ArrayList<Integer> areven = new ArrayList<>();
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i]%2==0){
                    count+=arr[i];
//                    areven.add(arr[i]);
//                    count+=areven.get(i);
                }
                else{
                    arodd.add(arr[i]);
                }
            }
            Collections.sort(areven);
            Collections.sort(arodd, Collections.reverseOrder());
//            if(areven.toArray().length>0 && arodd.toArray().length>0){
//            for(int i=0;i<areven.toArray().length; i++){
//                count+= areven.get(i);
//            }
//            }
            if(arodd.toArray().length>0){
                for(int i=0;i<(arodd.size()+1)/2;i++){
                    count+=arodd.get(i);
                }
                System.out.println(count);
            }
            else{
                System.out.println(0);
            }

        }
    }
}
