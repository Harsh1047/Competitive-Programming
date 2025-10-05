import java.util.Scanner;

public class Problem1903A {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            arr[i] = k;
        }
        boolean sorted = false;
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]) {
                sorted = true;
            }
            else{
                sorted = false;
                break;
            }
        }
        if(m>=2 || sorted || n==1){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
    }
}
