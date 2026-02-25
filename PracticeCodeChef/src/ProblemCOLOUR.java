import java.util.Scanner;

public class ProblemCOLOUR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int count=0;
            if(X>0) {
                X--;
                count++;
            }
            if(Y>0) {
                Y--;
                count++;
            }
            if(Z>0) {
                Z--;
                count++;
            }
            if(X>=Y && X>=Z){
                if(X>0 && Y>0){
                    X--;Y--;count++;
                }
                if(X>0 && Z>0){
                    X--;Z--;count++;
                }
                if(Y>0 && Z>0){
                    Y--;Z--;count++;
                }
            }
            else if(Y>=X && Y>=Z){
                if(X>0 && Y>0){
                    X--;Y--;count++;
                }
                if(Y>0 && Z>0){
                    Y--;Z--;count++;
                }
                if(X>0 && Z>0){
                    X--;Z--;count++;
                }

            }
            else if(Z>=X && Z>=Y){
                if(X>0 && Z>0){
                    X--;Z--;count++;
                }
                if(Y>0 && Z>0){
                    Y--;Z--;count++;
                }
                if(X>0 && Y>0){
                    X--;Y--;count++;
                }

            }

            System.out.println(count);
        }
    }
}
