import java.util.Scanner;

public class ProblemMANYSUMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(2*r-2*l+1);
        }
    }
}
