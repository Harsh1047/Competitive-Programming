import java.util.Scanner;

public class ProblemENDSORTED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count=0;
            int min=0;int max=0;
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                if(arr[i]==1) {
                    count+=i;
                    min=i;
                }
                else if(arr[i]==n) {
                    count+=n-i-1;
                    max=i;
                }
            }
            if(min>max) System.out.println(count-1);
            else System.out.println(count);
        }
    }
}
