import java.util.Scanner;

public class ProblemFLOWERBUY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count = 0;
            while(n>2){
                n-=3;
                count+=5;
            }
            if(count==0) System.out.println(4);
            else if(n==0) System.out.println(count);
            else if(n==1) System.out.println(count+3);
            else System.out.println(count+4);
        }
    }
}
