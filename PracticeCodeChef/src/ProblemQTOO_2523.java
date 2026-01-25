import java.util.Scanner;

public class ProblemQTOO_2523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int[] hash = new int[26];
            for(int i=0;i<n;i++){
                hash[s.charAt(i)-'a']++;
            }
            boolean isok = false;
            for(int i=0;i<26;i++){
                if(hash[i]>1) {
                    isok = true;
                    break;
                }
            }
            if(isok) System.out.println(s.length()-2);
            else System.out.println(-1);
        }
    }
}
