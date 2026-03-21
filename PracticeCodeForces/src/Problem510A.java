import java.util.Scanner;

public class Problem510A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int i=0;
        while(i<x){
            if(i<x) {
                for (int j = 0; j < y; j++) {
                    System.out.print("#");
                }
                i++;
            }
            if(i<x){
                System.out.println();
                for(int j=0;j<y-1;j++){
                    System.out.print(".");
                }
                i++;
            }
            if(i<x) {
                System.out.println("#");
                for (int j = 0; j < y; j++) {
                    System.out.print("#");
                }
                i++;
            }
            if(i<x) {
                System.out.println();
                System.out.print("#");
                for (int j = 0; j < y - 1; j++) {
                    System.out.print(".");
                }
                i++;
            }
            else break;
            System.out.println();
        }
    }
}
