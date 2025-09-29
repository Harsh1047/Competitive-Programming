import java.util.Scanner;

public class Problem282A {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            String s = sc.next();
            if(s.equals("X++")) x++;
            else if(s.equals("X--")) x--;
            else if(s.equals("++X")) ++x;
            else if(s.equals("--X")) --x;
        }
        System.out.println(x);
    }
}
