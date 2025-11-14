import java.util.Scanner;

public class Containerwithmostwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k=0;
        int maxvol = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int dist = j-i;
                k = Math.min(arr[i], arr[j]);
                k = dist*k;
                maxvol = Math.max(maxvol, k);
            }
        }
        System.out.println(maxvol);
    }
}
