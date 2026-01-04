import java.util.Scanner;

public class ProblemPSEUDOSORT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count=0;
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            for(int i=1;i<n;i++){
                if(arr[i-1]>arr[i]){
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
            for(int i=1;i<n;i++){
                if(arr[i-1]>arr[i]) count++;
            }
            if(count<1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
