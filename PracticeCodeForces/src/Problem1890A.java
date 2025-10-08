import java.util.*;

public class Problem1890A {
    public static void main(String[] args) {
        boolean istrue = false;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k=0;
        boolean isok = false;
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(arr[i]);
            }
            HashMap <Integer, Integer> freq = new HashMap<>();
            for(int i=0;i<n;i++){
                freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
            }
            if(freq.size() == 1){
                System.out.println("YES");
            }
            else if(freq.size() == 2){
                Iterator<Integer> it = freq.values().iterator();
                int c1 = it.next();
                int c2 = it.next();
                if(Math.abs(c1-c2)<=1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
