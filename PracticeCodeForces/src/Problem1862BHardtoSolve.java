import java.util.ArrayList;
import java.util.Scanner;

public class Problem1862BHardtoSolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int count=0;
            int n = sc.nextInt();
            ArrayList<Integer> arlist = new ArrayList<>();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            arlist.add(arr[0]);
            for(int i=1;i<n;i++){
                if(!(arr[i-1]<=arr[i])){
                    arlist.add(arr[i]);
                }
                arlist.add(arr[i]);
            }
            System.out.println(arlist.size());
            for(int i=0;i<arlist.size();i++){
                System.out.print(arlist.get(i) + " ");
            }
            System.out.println();
        }
    }
}
