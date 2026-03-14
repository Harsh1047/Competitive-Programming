import java.util.Scanner;

public class ProblemAVGARR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n%2!=0) {
                int s = x - (n / 2);
                while (n > 0) {
                    System.out.print(s + " ");
                    s++;
                    n--;
                }
                System.out.println();
            }
            else{
                int s = x - (n / 2);
                while (n > 0) {
                    System.out.print(s + " ");
                    s++;
                    if(s==x)s++;
                    n--;
                }
                System.out.println();
            }
        }
    }
}
