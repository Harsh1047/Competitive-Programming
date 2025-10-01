import java.util.Scanner;

public class Problem281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = str.substring(0,1).toUpperCase() + str.substring(1);
        System.out.println(s);
    }
}
