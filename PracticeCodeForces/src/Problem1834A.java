import java.util.Scanner;

public class Problem1834A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int positive=0;
            int negative=0;
            int opn=0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i] == 1) positive++;
                else if(arr[i] == -1) negative++;
            }
            for(int i=0;i<n;i++){
                if(negative<=positive && negative%2==0) break;
                else{
                    negative--;
                    positive++;
                    opn++;
                }
            }
            System.out.println(opn);
        }
    }
}
