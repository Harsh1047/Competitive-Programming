import java.util.Scanner;

public class Problem1829A {
    public static void main(String[] args) {
        String str1 = "codeforces";
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int count = 0;
            String str2 = sc.next();
            for(int i=0;i<10;i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
