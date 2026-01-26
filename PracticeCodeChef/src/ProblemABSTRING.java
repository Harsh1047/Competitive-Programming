import java.util.Scanner;

public class ProblemABSTRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            boolean is = true;
            int n = sc.nextInt();
            String s = sc.next();
            int[] hash = new int[26];
            for(int i=0;i<n;i++) hash[s.charAt(i)-'a']++;
            for(int i=0;i<26;i++){
                if(hash[i]%2!=0){
                    is = false;
                    break;
                }
            }
            if(is) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
