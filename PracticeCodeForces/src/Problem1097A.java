import java.util.Scanner;

public class Problem1097A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();
        String e = sc.next();
        boolean isok = false;
        for(int i=0;i<2;i++){
            if((s.charAt(i)==a.charAt(i))||(s.charAt(i)==b.charAt(i))||(s.charAt(i)==c.charAt(i))||(s.charAt(i)==d.charAt(i))||(s.charAt(i)==e.charAt(i))) isok = true;
        }
        if(isok) System.out.println("YES");
        else System.out.println("NO");
    }
}
