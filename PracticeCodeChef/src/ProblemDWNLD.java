import java.util.Scanner;

public class ProblemDWNLD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int sum=0;
            int[] tarr = new int[n];
            int[] darr = new int[n];
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(k>0 && x<=k) k-=x;
                else if(k>0 && x>k){
                    x-=k;
                    k=0;
                    sum+=x*y;
                }
                else sum+=x*y;
            }
            System.out.println(sum);
        }
    }
}
