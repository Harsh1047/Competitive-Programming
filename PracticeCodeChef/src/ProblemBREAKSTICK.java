import java.util.Scanner;

public class ProblemBREAKSTICK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
//            while(n>x){
//                n-=x;
//            }
            if((x%2==0 && n%2==0)) System.out.println("YES");
            else if (x%2!=0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
