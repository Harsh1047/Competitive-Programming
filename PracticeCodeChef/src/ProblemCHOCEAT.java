import java.util.Scanner;

public class ProblemCHOCEAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==b) System.out.println(a+b-1);
            else System.out.println(a+b);
        }
    }
}
