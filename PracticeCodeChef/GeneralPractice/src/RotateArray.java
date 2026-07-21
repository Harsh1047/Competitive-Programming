import java.util.Scanner;

public class RotateArray {

    public static int[] rotate(int[] arr, int n){
        int temp = arr[0];
        for(int i=0;i<n;i++){
            arr[i] = arr[i+1];
            if(i==n-1) arr[n-1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        arr = rotate(arr, x);
        for(int i=0;i<n;i++) System.out.print(arr[i] + " ");
    }
}
