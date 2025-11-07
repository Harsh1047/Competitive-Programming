import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Problem1883B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int[] arr = new int[26];
            for(int i=0;i<str.length();i++){
                arr[str.charAt(i)-'a']++;
            }
            int oddfreq = 0;
            for(int i=0;i<26;i++){
                oddfreq+= arr[i] % 2;
            }
            if(oddfreq>k+1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
