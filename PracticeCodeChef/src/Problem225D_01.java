import java.util.Scanner;

public class Problem225D_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = 100 + 4*x;
        if(k>300) System.out.println(300);
        else System.out.println(k);
    }
}
