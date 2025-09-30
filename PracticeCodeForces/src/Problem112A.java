import java.util.Scanner;

public class Problem112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1  = sc.next();
        String str2 = sc.next();
        int res = str1.compareToIgnoreCase(str2);
        if(res<0){
            System.out.println(-1);
        }
        else if(res>0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
