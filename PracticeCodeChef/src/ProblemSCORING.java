import java.util.Scanner;

public class ProblemSCORING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.print((y+x)/2 + " ");
            System.out.println((y-x)/2);
        }
    }
}
