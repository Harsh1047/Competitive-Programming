import java.util.Scanner;

public class ProblemDISCOUNT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=5) System.out.println(n*85);
        else System.out.println(n*100);
    }
}
