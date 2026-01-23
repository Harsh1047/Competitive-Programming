import java.util.Scanner;

public class ProblemGRPASSN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            boolean isok = false;
            int[] hash = new int[n];
            for(int i=0;i<n;i++){
                hash[arr[i]-1]++;
            }
            for(int i=0;i<n-1;i++){
                if(hash[i]%(i+1)==0 || hash[i]==0) isok = true;
                else{
                    isok = false;
                    break;
                }
            }
            if(isok) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
