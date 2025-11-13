import java.util.ArrayList;
import java.util.Scanner;

public class ProblemP3BAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int count=0;
            int n = sc.nextInt();
            ArrayList<Integer> arl = new ArrayList<>();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                arl.add(arr[i]);
            }
            while(arl.size()!=0){
                if(arl.indexOf(n)>(n-1)/2){
                    count+=n-1-arl.indexOf(n);
                }
                else{
                    count+=arl.indexOf(n);
                }

                arl.remove(Integer.valueOf(n));
                n--;
            }
            System.out.println(count);
        }
    }
}
