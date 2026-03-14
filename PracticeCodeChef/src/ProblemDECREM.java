import java.util.Scanner;

public class ProblemDECREM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(r>=2*l) System.out.println(-1);
            else System.out.println(r);
        }
    }
}
