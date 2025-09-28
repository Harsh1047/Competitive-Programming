import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String name = sc.next();
            if(name.length() > 10) {
                char m = name.charAt(0);
                char n = name.charAt(name.length() - 1);
                int len = name.length() - 2;
                StringBuilder st = new StringBuilder();
                st.append(m);
                st.append(len);
                st.append(n);
                System.out.println(st);
            }
            else{
                System.out.println(name);
            }
        }
    }
}