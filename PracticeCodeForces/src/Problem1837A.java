import java.util.Scanner;

public class Problem1837A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int k = sc.nextInt();
            int p = 0;
            for(int i=0;i<x;i++){
                if((x-i)%k!=0){
                    p=i;
                    break;
                }
            }
            if(p>0){
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }
            if(p==0) {
                System.out.println((x - p) + " ");
            }
            else {
                System.out.print((x-p) + " ");
                System.out.println(p);
            }
        }
    }
}
