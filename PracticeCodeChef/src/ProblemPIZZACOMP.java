import java.util.Scanner;

public class ProblemPIZZACOMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            float a = sc.nextInt();
            float b = sc.nextInt();
            float pa = a/100;
            float pb = b/225;
            if(pa>pb) System.out.println("Large");
            else if (pa<pb) System.out.println("Small");
            else System.out.println("Equal");
        }
    }
}
