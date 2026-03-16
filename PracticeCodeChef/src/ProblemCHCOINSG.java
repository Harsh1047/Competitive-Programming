import java.util.ArrayList;
import java.util.Scanner;

public class ProblemCHCOINSG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();;
            if(n%6==0) System.out.println("Misha");
            else System.out.println("Chef");
        }
    }
}
