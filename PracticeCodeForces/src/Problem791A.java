import java.util.Scanner;

public class Problem791A {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while(n1<=n2){
            count++;
            n1=n1*3;
            n2=n2*2;
        }
        System.out.println(count);
    }
}
