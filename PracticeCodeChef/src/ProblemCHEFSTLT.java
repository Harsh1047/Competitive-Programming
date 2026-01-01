import java.util.Scanner;

public class ProblemCHEFSTLT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int countmax=0;
            int countmin=0;
            String s1 = sc.next();
            String s2 = sc.next();
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i) == s2.charAt(i) && s1.charAt(i)!='?') continue;
                else if(s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == '?'){
                    countmax+=i;
                }
                else if(s1.charAt(i)!= s2.charAt(i) && s1.charAt(i)!='?' && s2.charAt(i)!='?') {
                    countmax++; countmin++;
                }
                else countmax++;
            }
            System.out.println(countmin+" "+countmax);
        }
    }
}
