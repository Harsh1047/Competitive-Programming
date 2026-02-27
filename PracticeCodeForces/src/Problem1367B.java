import java.util.Scanner;

public class Problem1367B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int even = 0; int odd = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i]%2==0) even++;
                else odd++;
            }
            int count=0;
            if(odd != n/2) System.out.println(-1);
            else{
                for(int i=0;i<n;i+=2){
                    if(arr[i]%2!=0) count++;
                }
                System.out.println(count);
            }
        }
    }
}
