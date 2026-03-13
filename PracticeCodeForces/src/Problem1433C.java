import java.util.Scanner;

public class Problem1433C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            boolean issame = true;
            for(int i=1;i<n;i++){
                if(arr[i-1]!=arr[i]) issame = false;
            }
            int largest=arr[0];
            int k=0;
            if(issame) System.out.println(-1);
            else{
                for(int i=1;i<n-1;i++){
                    if(arr[i]>largest && arr[i+1]<largest){
                        largest = arr[i];
                        k=i;
                    }
                }
                if(largest>arr[n-1]) System.out.println(k);
                else System.out.println(n-1);
            }
        }
    }
}
