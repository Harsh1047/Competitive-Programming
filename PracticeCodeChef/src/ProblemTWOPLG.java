import java.util.Scanner;

public class ProblemTWOPLG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x%2==0) System.out.println("Bob");
            else if(y%2==0 || x%2!=0) System.out.println("Alice");
        }
    }
}
