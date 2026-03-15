import java.util.Scanner;

public class ProblemUNQEQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if((n/2)%2!=0) System.out.println("NO");
            else{
                System.out.println("YES");
                for(int i=1;i<=n/4;i++){
                    System.out.print(i+" ");
                }
                for(int i=3*n/4+1;i<=n;i++){
                    System.out.print(i+" ");
                }
                System.out.println();
                for(int i=n/4+1;i<=3*n/4;i++) {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
