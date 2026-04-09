import java.util.Arrays;
import java.util.Scanner;

public class ProblemABC7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int pa = 0, pb = 0, pc = 0;
            int a = 0,b = 0,c = 0;
            pa = sc.nextInt();
            pb = sc.nextInt();
            int q = Integer.MAX_VALUE;
            pc = sc.nextInt();
            int w=0;
            int[] arr = new int[n];
            for(int i=0;i<n-1;i++){
                    a = sc.nextInt();
                    b = sc.nextInt();
                    c = sc.nextInt();
                q = Math.min(Math.abs(pa-a),Math.min(Math.abs(pa-b),Math.min(Math.abs(pa-c), Math.min(Math.abs(pb-a),Math.min(Math.abs(pb-b),Math.min(Math.abs(pb-c),
                            Math.min(Math.abs(pc-a),Math.min(Math.abs(pc-b),Math.min(Math.abs(pc-c),q)))))))));
                arr[w] = q; w++;
                pa=a;pb=b;pc=c;
            }
            Arrays.sort(arr);
            System.out.println(arr[n-1]-arr[0]);
        }
    }
}
