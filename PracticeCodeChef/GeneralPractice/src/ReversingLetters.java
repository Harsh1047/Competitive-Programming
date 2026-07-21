import java.util.ArrayList;
import java.util.Scanner;

public class ReversingLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int x=0;
        for(int i=0;i<Math.min(s1.length(), s2.length());i++){
            if(s1.charAt(i)!=s2.charAt(i)) x++;
        }
        System.out.println(x);
    }
}
