import java.util.Arrays;
import java.util.Scanner;

public class ProblemMOVHYP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int loudness=0;
            int minofall=Integer.MAX_VALUE;
            int n = sc.nextInt(); //seat = 2n+1
            int[] arr = new int[n + 1];
            for(int i=0;i<n+1;i++) arr[i] = sc.nextInt();
            for(int i=1;i<n+1;i++){
                if(arr[i-1]>arr[i]) loudness = arr[i-1];
                else loudness = arr[i];
                if(loudness<minofall) minofall=loudness;
            }
            System.out.println(minofall);
        }
    }
}
