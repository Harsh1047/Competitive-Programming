import java.util.Scanner;

public class Recursion {
    static void fun(int n, int i){
        if(n<=0) return;
        System.out.println(i);
        fun(--n, ++i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n, 1);
    }
}
