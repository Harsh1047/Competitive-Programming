import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ProblemOZ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            ArrayList<Integer> arl = new ArrayList<>();
            for(int i=0;i<n;i++){
                arl.add((int) s.charAt(i));
            }
            Collections.sort(arl);
            int count1=0;int count0=0;
            for(int i=0;i<n;i++){
                if(arl.get(i)==1) count1++;
                else count0++;
            }
        }
    }
}
