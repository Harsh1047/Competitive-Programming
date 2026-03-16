import java.util.HashMap;
import java.util.Scanner;

public class ProblemCHEFDINE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] cat = new int[n];
            int[] time = new int[n];
            for(int i=0;i<n;i++) cat[i] = sc.nextInt();
            for(int i=0;i<n;i++) time[i] = sc.nextInt();
            HashMap<Integer, Integer> hmap = new HashMap<>();
            for(int i=0;i<n;i++){
                hmap.put(cat[i], time[i]);
            }
        }
    }
}
