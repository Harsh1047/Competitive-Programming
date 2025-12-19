import java.util.Scanner;

public class ProblemCSTOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            float s = sc.nextFloat();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            s = s+(s*c/100);
            if(s>=a && s<=b) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
