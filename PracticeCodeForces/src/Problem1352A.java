import java.util.Scanner;

public class Problem1352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int count=0;
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length();i++){
//                if(s.charAt(i)=='0') continue;
                if(s.charAt(i)!='0'){
                    count++;
                    sb.append(s.charAt(i));
                    for(int j=i+1;j<s.length();j++) sb.append(0);
                    sb.append(" ");
                }
            }
            System.out.println(count);
            System.out.println(sb);
        }
    }
}
