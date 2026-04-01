import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem232C_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count=0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                int val = arr[i] - i+1;
                map.put(val, map.getOrDefault(val,0)+1);
            }
            int p = 0;
            for(int i : map.values()){
                if(i>=2) p += i*(i-1)/2;
            }

            System.out.println(p);
        }
    }
}
