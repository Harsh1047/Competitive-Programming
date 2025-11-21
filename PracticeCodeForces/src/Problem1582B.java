import java.util.Scanner;

public class Problem1582B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            boolean ispossible = false;
            long n = sc.nextLong();
            long[] arr = new long[(int) n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                if(arr[i]==1){
                    ispossible = true;
                }
            }
            if(!ispossible){
                System.out.println(0);
            }
            else{
                long count1=0;
                long count0=0;
                boolean haszero = false;
                for(int i=0;i<n;i++){
                    if(arr[i]==1) count1++;
                    else if(arr[i]==0) {
                        count0++;
                    }
                }
                System.out.println((long)(count1 * Math.pow(2,count0)));
            }
        }
    }
}
