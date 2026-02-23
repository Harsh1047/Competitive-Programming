import java.util.Scanner;

public class ProblemKNIGHT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int scolor = x1%2==y1%2 ? 1:0;
            int dcolor = x2%2==y2%2 ? 1:0;
            if(scolor == dcolor) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
