import java.util.Scanner;

public class ProblemAVGPROBLEM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            float a = sc.nextInt();
            float b = sc.nextInt();
            float c = sc.nextInt();
            if((a+b)/2>c) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
