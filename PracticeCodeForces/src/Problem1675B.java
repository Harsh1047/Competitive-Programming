import java.util.Scanner;

public class Problem1675B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int count=0;
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            for(int i=n-2;i>=0;i--){
                while(arr[i]>=arr[i+1]){
                    count++;
                    arr[i]/=2;
                    if(arr[i]==0){
                        break;
                    }
                }
                if(arr[i]==0 && arr[i+1]==0){
                    count=-1;
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
