import java.util.Scanner;

public class ProblemPETSTORE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] hash = new int[101];
            for(int i=0;i<n;i++) {
                int x = sc.nextInt();
                hash[x]++;
            }
            boolean isok = true;
            for(int i=0;i<101;i++) {
                if(hash[i]%2!=0) {
                    isok = false; break;
                }
            }
            System.out.println(isok ? "YES":"NO");
        }
    }
}
