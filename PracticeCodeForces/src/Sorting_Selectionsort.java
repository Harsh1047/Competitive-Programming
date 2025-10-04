import java.util.Scanner;

public class Sorting_Selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            arr[i] = k;
        }

        for(int i=0;i<n;i++){
            int mmi = i;
            for(int j=i;j<n;j++){
                if(arr[j] < arr[mmi]){
                    mmi = j;

                }
            }
            int temp = arr[mmi];
            arr[mmi] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void Swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}