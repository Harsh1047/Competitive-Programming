import java.util.Scanner;

public class Problem227D_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int count=b;
            while(a-x>=0){
                    count+=y;
                    a-=x;
            }
            count+=a;
            System.out.println(count);
        }
    }
}
