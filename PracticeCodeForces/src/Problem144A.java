import java.util.Scanner;

public class Problem144A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int max = Integer.MIN_VALUE; int indmax = 0;
        int min = Integer.MAX_VALUE; int indmin = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>max) {
                max = arr[i];
                indmax = i;
            }
            if(arr[i]<=min) {
                min = arr[i];
                indmin = i;
            }
        }
        if(indmax>indmin) System.out.println(indmax + n - 1 - indmin - 1);
        else System.out.println(indmax + n - 1 - indmin );
    }
}
