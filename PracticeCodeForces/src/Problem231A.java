import java.util.Scanner;

public class Problem231A {
    public static void main(String[] args) {
        int count = 0; //how many problems team will solve
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //No. of problems
        while(n-->0){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            if(n1+n2+n3>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
