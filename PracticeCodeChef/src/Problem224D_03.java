import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Problem224D_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            Integer[] hash = new Integer[26];
            Arrays.fill(hash, 0);
            for(int i=0;i<n;i++){
                if((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')){
                    hash[s.charAt(i)-'A']++;
                }
                else if((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')){
                    hash[s.charAt(i)-'a']++;
                }
            }
            Arrays.sort(hash, Collections.reverseOrder());
            System.out.println(hash[0]+hash[1]);
        }
    }
}
