import java.util.Scanner;

public class Problem1858A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(c%2==0){
                if(a+c/2>b+c/2){
                    System.out.println("First");
                }
                else{
                    System.out.println("Second");
                }
            }
            else{
                if((a+c/2)+1>(b+c/2)){
                    System.out.println("First");
                }
                else{
                    System.out.println("Second");
                }
            }

        }
    }
}
