import java.util.Scanner;

public class ProblemMAX123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int score = 0;
            if(x>0 && y>0) {
                while (x > 0 && y > 0) {
                    score += 2;
                    y--;
                    x -= 2;
                }
            }
            if(x>0 && y==0){
                while(x>0){
                    score++;
                    x-=3;
                }
            }
            if(y>0 && x==0){
                while(y>0){
                    score+=2;
                    y-=3;
                }
            }
            System.out.println(score);

        }
    }
}
