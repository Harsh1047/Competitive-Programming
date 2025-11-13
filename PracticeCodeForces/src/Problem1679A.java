import java.util.Scanner;

public class Problem1679A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            boolean ispossible = false;
            long summax = 0;
            long summin = 0;
            if(n%6==0){
                summax = n/6;
            }
            else if(n%6==2){
                summax = (n-6)/6+2;
            }
            else if(n%6==4){
                summax = (n-4)/6+1;
            }
            else{
                summax = -1;
            }
            if(n%4==0 || n%4==2){
                summin = n/4;
            }
            else{
                summin = -1;
            }
            if((summax == -1) && (summin == -1) || n<4){
                System.out.print(-1);
            }
            else{
                System.out.print(summax + " " + summin);
            }
            System.out.println();

        }
    }
}
