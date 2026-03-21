import java.util.Scanner;

public class Problem514A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(i==0 && s.charAt(i)=='9') sb.append(s.charAt(i));
                else if(s.charAt(i)>'4') sb.append('9'-s.charAt(i));
                else sb.append(s.charAt(i));
            }
            System.out.println(sb);
    }
}
