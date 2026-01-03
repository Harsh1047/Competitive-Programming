import java.util.Scanner;

public class ProblemPIZZABURGER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(y<=x) System.out.println("Pizza");
            else if(z<=x && y>x) System.out.println("Burger");
            else if(x<y && x<z) System.out.println("Nothing");
        }
    }
}
