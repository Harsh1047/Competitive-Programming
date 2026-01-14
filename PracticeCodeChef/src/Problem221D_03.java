import java.util.Scanner;

public class Problem221D_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int count=0;
            boolean not=true;
            String s = sc.next();
            int[] hash = new int[26];
            for(int i=0;i<n;i++){
                hash[s.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++){
                if(hash[i]>2) not = false;
            }
            if(!not) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
