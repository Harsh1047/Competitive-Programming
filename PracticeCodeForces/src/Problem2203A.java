import java.util.Scanner;

public class Problem2203A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            float n = sc.nextInt();
            float m = sc.nextInt();
            float d = sc.nextInt();
            int i=1;
            while(true){
                if(m*i>=d) break;
                else i++;
            }
            if(m*i==d) System.out.println((int)Math.ceil(n/(i+1)));
            else {
//                i--;
                System.out.println((int)Math.ceil(n/i));
            }

        }
    }
}
