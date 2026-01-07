import java.util.Scanner;

public class ProblemFBMATCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            boolean isok = false;
            int n = sc.nextInt();
            String s = sc.next();
            int[] hash = new int[27];
            for(int i=0;i<n;i++){
                hash[s.charAt(i)-'a']++;
            }
            for(int i=0;i<27;i++){
                if(hash[i]>1) {
                    isok = true;
                    break;
                }
            }
            if(isok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
