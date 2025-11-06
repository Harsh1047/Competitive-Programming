import java.util.ArrayList;
import java.util.Scanner;

public class Problem1777A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            int[] arr = new int[n];
            ArrayList<Integer> arl = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                arl.add(arr[i]);

            }
            int i = 1;
            while (i < arl.size())
                if ((arl.get(i) % 2 == 0 && arl.get(i - 1) % 2 == 0) || (arl.get(i) % 2 != 0 && arl.get(i - 1) % 2 != 0)) {
                    int k = arl.get(i) * arl.get(i - 1);
                    arl.set(i-1, k);
                    arl.remove(i);
                    count++;
                }
            else{
                i++;
                }

        System.out.println(count);

    }
    }
}
