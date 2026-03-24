import java.util.Scanner;

public class Problem492A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=0;
        int i=0;
        int x=0;
        int z=0;
        while(n>0){
            x+=2*i+1;
//            z+=x;
            n = n-x;
            k++;
            i++;
            System.out.println(x + " " + z + " " + n);
        }
        System.out.println(k-1);
    }
}
