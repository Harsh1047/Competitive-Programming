import java.util.Scanner;

public class ProblemCANDY123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            boolean limak = true;
            boolean bob = true;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int q=0;
            while(true){
                q++;
                if(a-q<0){
                    limak = false;
//                    System.out.println(a);
                    break;
                }
                else{
                    a-=q;
//                    System.out.println(a);
                }
                q++;
                if(b-q<0){
                    bob = false;
//                    System.out.println(b);
                    break;
                }
                else {
                    b-=q;
//                    System.out.println(b);
                }
            }
            if(!bob) System.out.println("Limak");
            else if(!limak) System.out.println("Bob");
        }
    }
}
