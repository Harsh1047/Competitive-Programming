import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem221D_02
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int count=0;
            boolean jacketon = false;
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(arr[i]>b){
                    jacketon = false;
                }
                if(arr[i]<a && !jacketon) {
                    count++;
                    jacketon = true;
                }

            }
            System.out.println(count);
        }
    }
}
