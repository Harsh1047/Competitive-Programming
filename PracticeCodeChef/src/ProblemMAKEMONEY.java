import java.util.Scanner;

public class ProblemMAKEMONEY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int c = sc.nextInt();
            int k = x-c;
            int total=0;
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                if(arr[i]<k) total+=k;
                else total+=arr[i];
            }
            System.out.println(total);
        }
    }
}
