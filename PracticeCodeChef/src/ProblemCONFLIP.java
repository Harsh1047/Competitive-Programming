import java.util.Scanner;

public class ProblemCONFLIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int g = sc.nextInt();
            while(g-->0){
                int i = sc.nextInt();
                int n = sc.nextInt();
                int q = sc.nextInt();
                if(n%2==0){
                    System.out.println(n/2);
                }
                else{
                    if((q==1 && i==1) || (q==2 && i==2)) System.out.println(n/2);
                    else if((q==2 && i==1) || (q==1 && i==2)) System.out.println(n / 2 + 1);

                }
            }
        }
    }
}
