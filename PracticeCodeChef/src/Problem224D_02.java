import java.util.Scanner;

public class Problem224D_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int maxstreak=0;
            int newstreak=0;
            for(int i=0;i<n;i++){
                if(arr[i]!=0) {
                    newstreak++;
                    maxstreak = Math.max(maxstreak, newstreak);
                }
                else newstreak=0;
            }
            System.out.println(maxstreak);
        }
    }
}
