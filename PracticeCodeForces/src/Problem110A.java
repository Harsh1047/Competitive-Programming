import java.util.Scanner;

public class Problem110A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='4' || s.charAt(i)=='7') count++;
        }
        if((count%4==0 || count%7==0) && count>0) System.out.println("YES");
        else System.out.println("NO");

    }
}
