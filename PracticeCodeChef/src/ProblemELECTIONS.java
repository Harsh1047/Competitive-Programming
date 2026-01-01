import java.util.Scanner;

public class ProblemELECTIONS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>50 && b<=50 && c<=50) System.out.println("A");
            else if(a<=50 && b>50 && c<=50) System.out.println("B");
            else if(a<=50 && b<=50 && c>50) System.out.println("C");
            else System.out.println("NOTA");
        }
    }
}
