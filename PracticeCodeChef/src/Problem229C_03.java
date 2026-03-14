import java.util.Scanner;

public class Problem229C_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int max = Integer.MIN_VALUE; int maxind = -1;
            int min = Integer.MAX_VALUE; int minind = -1;
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    max = arr[i];
                    maxind = i;
                }
            }
            for(int i=0;i<n;i++){
                if(arr[i]<min && i!=maxind){
                    min = arr[i];
                    minind = i;
                }
            }
            int max2 = Integer.MIN_VALUE; int max2ind = -1;
            for(int i=0;i<n;i++){
                if(arr[i]>max2 && i!=maxind && i!=minind){
                    max2 = arr[i];
                    max2ind = i;
                }
            }
            if(arr[maxind] + arr[max2ind] != arr[minind]) System.out.println((maxind+1) + " " + (max2ind+1) + " " + (minind+1));
            else System.out.println(-1);
        }
    }
}
