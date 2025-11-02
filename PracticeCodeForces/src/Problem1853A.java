import java.util.Scanner;

public class Problem1853A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k=Integer.MAX_VALUE;
            boolean isNotSorted = false;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=1;i<n;i++){
                if(!(arr[i]>=arr[i-1])){
                    isNotSorted = true;
                }
                else{
                    k = Math.min(arr[i] - arr[i-1],k);
                }
            }
            if(isNotSorted){
                System.out.println(0);
            }
            else{
                System.out.println(k/2+1);
            }
        }
    }
}
