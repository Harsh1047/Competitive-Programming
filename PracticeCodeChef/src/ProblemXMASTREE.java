import java.util.Scanner;

public class ProblemXMASTREE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int m = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(m*b-n*a);
    }
}
