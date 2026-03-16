import java.util.Scanner;

public class ProblemHTMLTAGS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            boolean is = true;
            if(s.length()<4) is = false;
            if(s.charAt(0) != '<' || s.charAt(1)!='/') is = false;
            if(is){
                for(int i=2;i<s.length()-1;i++) {
                    if ((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9')) continue;
                    else {
                        is = false;
                        break;
                    }
                }
            }
            if(is){
                if(s.charAt(s.length()-1)!='>') is = false;
            }
            if(is) System.out.println("SUCCESS");
            else System.out.println("ERROR");
        }
    }
}
