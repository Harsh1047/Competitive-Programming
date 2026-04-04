import java.util.Scanner;

public class ProblemCONTEST2218C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[3*n];
            int k = n+1;
            int i=0;
            for(int j=0;j<n;j++){
                arr[i] = k++;
                i+=2;
                arr[i] = k++;
                i++;
            }
            int x=1;
            for(int j=1;j<3*n;j+=3){
                arr[j] = x++;
            }
            for(int j=0;j<3*n;j++) System.out.print(arr[j]+ " ");
            System.out.println();
        }
    }
}
