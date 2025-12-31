import java.util.Scanner;

public class ProblemCAKEBAKE7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int happy = m-n;
        if(happy>n) System.out.println(n);
        else System.out.println(happy);
    }
}
