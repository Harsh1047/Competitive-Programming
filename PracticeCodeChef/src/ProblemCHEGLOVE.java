import java.util.Scanner;

public class ProblemCHEGLOVE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] fin = new int[n];
            int[] gl = new int[n];
            for(int i=0;i<n;i++) fin[i] = sc.nextInt();
            for(int i=0;i<n;i++) gl[i] = sc.nextInt();
            fun(fin,gl,n);
        }
    }
    static void fun(int[] fin, int[] gl, int n){
        boolean front = false, back = false;
        for(int i=0;i<n;i++) {
            if (fin[i] <= gl[i]) {
                front = true;
            } else if (fin[i] > gl[i]) {
                front = false;
                break;
            }
        }
        for(int i=0;i<n;i++) {
            if(fin[i] <= gl[n-i-1]) back = true;
            else if (fin[i] > gl[n-i-1]){
                back = false; break;
            }
        }
        if(front && back) System.out.println("Both");
        else if(front) System.out.println("Front");
        else if(back) System.out.println("Back");
        else System.out.println("None");
    }
}
