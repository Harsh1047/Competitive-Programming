import java.util.Scanner;

public class ProblemAVGPERM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            if(n>3) {
                arr[n - 1] = n;
                arr[n - 2] = n - 2;
                arr[0] = n - 1;
                arr[1] = n - 3;
                for (int i = 1; i < n - 3; i++) {
                    arr[i + 1] = i;
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            else{
                for(int i=1;i<=n;i++){
                    System.out.print(n-i+1 + " ");
                }
                System.out.println();
            }
        }


    }
}
