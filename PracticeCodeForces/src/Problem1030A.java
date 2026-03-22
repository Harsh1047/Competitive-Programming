import java.util.Scanner;

public class Problem1030A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean ishard = false;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 1) ishard = true;
        }
        if(ishard) System.out.println("HARD");
        else System.out.println("EASY");
    }
}
