import java.util.Scanner;

public class ProblemMAGICHF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int s = sc.nextInt();
            int[] arr = new int[n];
            arr[x-1] = 1;
            int a=0;int b=0;
            for(int i=0;i<s;i++){
                a = sc.nextInt();
                b = sc.nextInt();
                int temp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = temp;
            }
            for(int i=0;i<n;i++) {
                if (arr[i] == 1) System.out.println(i + 1);
            }
        }
    }
}
