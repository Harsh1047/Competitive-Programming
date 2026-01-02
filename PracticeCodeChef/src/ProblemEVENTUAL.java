import java.util.Scanner;

public class ProblemEVENTUAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean isok = true;
            int[] hash = new int[27];
            String s = sc.next();
            for(int i=0;i<n;i++){
                hash[s.charAt(i)-'a']++;
            }
            for(int i=0;i<27;i++){
               if(hash[i]%2!=0){
                    isok = false;
                    break;
                }
            }
            if(isok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
