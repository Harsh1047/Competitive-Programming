import java.util.Scanner;

public class Problem257D_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int sum = 0;
            int i=0;
            boolean used = false;
            boolean neg = false;
            while(i<n){
                sum+=arr[i];
                if(arr[i]<min) min = arr[i];
                if(sum<0 && !used){
                    sum-=min;
                    used = true;
                    if(sum<0){
                        neg = true;
                        break;
                    }
                }
                if(sum<0 && used) {
                    neg = true;
                    break;
                }
                i++;
            }
            if(neg) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
