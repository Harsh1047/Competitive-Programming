import java.util.Scanner;

public class ProblemCHFHEIST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int D = sc.nextInt(); D--;
            int d = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int total = P;
//            System.out.println(total);
            int i=1;
            while(D>0){
                for(int j=0;j<d;j++) total+=Q*i + P;
                D-=d;i++;
            }
            System.out.println(total);
        }
    }
}
