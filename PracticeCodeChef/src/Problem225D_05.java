import java.util.Scanner;

public class Problem225D_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int max = 0;
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=i+k;j<i+(2*k) && j<n; j++){
//                    System.out.print(arr[j] - arr[i]);
//                    System.out.println(" "+j +" " +i);
                    if(max < Math.abs(arr[j] - arr[i])) max = Math.abs(arr[j] - arr[i]);
                }
            }
            System.out.println(max);
        }
    }
}
