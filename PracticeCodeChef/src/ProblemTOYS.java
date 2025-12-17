import java.util.Scanner;

public class ProblemTOYS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n-m<0) {
            System.out.println(0);
        }
        else{
            System.out.println(n-m);
        }
    }
}
