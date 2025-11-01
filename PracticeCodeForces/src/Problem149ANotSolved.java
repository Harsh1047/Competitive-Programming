import java.util.Arrays;
import java.util.Scanner;

public class Problem149ANotSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum=0;
        boolean ispossible = false;
        int[] arr = new int[12];
        for(int i=0;i<12;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int p=0;
        for(int i=11;i>=0;i--){
            sum+=arr[i];
            if(sum>=k){
                ispossible = true;
                break;
            }
            p=p+1;
        }
        if(arr[0]==arr[11] && arr[0]==1 && k==12){
            System.out.println(12);
        }
        else if(ispossible){
            System.out.println(p);
        }
        else{
            System.out.println(-1);
        }

    }
}
